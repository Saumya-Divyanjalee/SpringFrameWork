const BASE_URL = "http://localhost:8080/api/v1/customer";

function saveCustomer() {
    let customerData = {
        // cId is omitted so the database can auto-generate it
        cName: $('#customerName').val(),
        cAddress: $('#customerAddress').val(),
        cPhone: $('#customerPhone').val()
    };

    $.ajax({
        url: BASE_URL,
        method: "POST",
        contentType: "application/json",
        data: JSON.stringify(customerData),
        success: function(res) {
            alert(res.message);
            $('#customerForm')[0].reset();
            loadCustomers();
        },
        error: function(xhr) {
            alert("Error: " + xhr.responseJSON.message);
        }
    });
}

function loadCustomers() {
    $.ajax({
        url: BASE_URL,
        method: "GET",
        success: function(response) {
            let tbody = $('#customerTableBody');
            tbody.empty();
            response.data.forEach(function(customer) {
                // We use template literals carefully here
                let row = `<tr>
                    <td>${customer.cId}</td>
                    <td>${customer.cName}</td>
                    <td>${customer.cAddress}</td>
                    <td>${customer.cPhone}</td>
                </tr>`;

                let $row = $(row);
                // Attach the click event using jQuery instead of inline onclick
                $row.click(function() {
                    populateForm(customer.cId, customer.cName, customer.cAddress, customer.cPhone);
                });

                tbody.append($row);
            });
        }
    });
}

function updateCustomer() {
    let id = $('#customerId').val();
    if (!id) {
        alert("Please select a customer from the table first!");
        return;
    }

    let customerData = {
        cId: parseInt(id),
        cName: $('#customerName').val(),
        cAddress: $('#customerAddress').val(),
        cPhone: $('#customerPhone').val()
    };

    $.ajax({
        url: BASE_URL + "/" + id,
        method: "PUT",
        contentType: "application/json",
        data: JSON.stringify(customerData),
        success: function(res) {
            alert("Customer Updated!");
            loadCustomers();
            $('#customerForm')[0].reset();
        },
        error: function(xhr) {
            // This will now tell you if validation failed
            let msg = xhr.responseJSON ? xhr.responseJSON.message : "Update Failed";
            alert("Error: " + msg);
        }
    });
}

function deleteCustomer() {
    let id = $('#customerId').val();
    if(confirm("Are you sure?")) {
        $.ajax({
            url: BASE_URL + "/" + id,
            method: "DELETE",
            success: function() {
                alert("Deleted!");
                loadCustomers();
                $('#customerForm')[0].reset();
            }
        });
    }
}

function populateForm(id, name, address, phone) {
    $('#customerId').val(id);
    $('#customerName').val(name);
    $('#customerAddress').val(address);
    $('#customerPhone').val(phone);
}
function clearForm() {
    $('#customerForm')[0].reset();
    $('#customerId').val(''); // Manually clear the readonly ID field
}