function saveItem() {
    let itemName = $('#itemName').val();
    let itemPrice = parseFloat($('#itemPrice').val());
    let itemQuantity = parseInt($('#itemQuantity').val());
    let itemDescription = $('#itemDescription').val();

    if (!itemName || !itemPrice || !itemQuantity) {
        alert("Please fill in all required fields!");
        return;
    }

    if (itemPrice <= 0) {
        alert("Item price must be greater than 0!");
        return;
    }

    if (itemQuantity < 0) {
        alert("Item quantity cannot be negative!");
        return;
    }

    $.ajax({
        url: "http://localhost:8080/api/v1/item",
        method: "POST",
        contentType: "application/json",
        data: JSON.stringify({
            // NO itemId - auto-generated
            // NO itemCost - auto-calculated
            "itemName": itemName,
            "itemPrice": itemPrice,
            "itemQuantity": itemQuantity,
            "itemDescription": itemDescription
        }),
        success: function(response) {
            alert("Item Saved Successfully!");
            $('#itemForm')[0].reset();
            loadItems();
        },
        error: function(xhr) {
            let errorMessage = xhr.responseJSON?.message || "Error saving item";
            alert(errorMessage);
        }
    });
}

function updateItem() {
    let itemId = $('#itemId').val();
    let itemName = $('#itemName').val();
    let itemPrice = parseFloat($('#itemPrice').val());
    let itemQuantity = parseInt($('#itemQuantity').val());
    let itemDescription = $('#itemDescription').val();

    if (!itemId || !itemName || !itemPrice || !itemQuantity) {
        alert("Please fill in all required fields!");
        return;
    }

    $.ajax({
        url: "http://localhost:8080/api/v1/item/" + itemId,
        method: "PUT",
        contentType: "application/json",
        data: JSON.stringify({
            "itemName": itemName,
            "itemPrice": itemPrice,
            "itemQuantity": itemQuantity,
            "itemDescription": itemDescription
        }),
        success: function(response) {
            alert("Item Updated Successfully!");
            $('#itemForm')[0].reset();
            loadItems();
        },
        error: function(xhr) {
            alert(xhr.responseJSON?.message || "Error updating item");
        }
    });
}

function deleteItem() {
    let itemId = $('#itemId').val();
    if (!itemId) {
        alert("Please enter Item ID to delete!");
        return;
    }

    if (confirm("Are you sure you want to delete item " + itemId + "?")) {
        $.ajax({
            url: "http://localhost:8080/api/v1/item/" + itemId,
            method: "DELETE",
            success: function(response) {
                alert("Item Deleted Successfully!");
                $('#itemForm')[0].reset();
                loadItems();
            },
            error: function(xhr) {
                alert(xhr.responseJSON?.message || "Error deleting item");
            }
        });
    }
}

function loadItems() {
    $.ajax({
        url: "http://localhost:8080/api/v1/item",
        method: "GET",
        success: function(response) {
            let tbody = $('#itemTableBody');
            tbody.empty();

            let items = response.data || response;

            items.forEach(function(item) {
                let row = `<tr onclick="populateForm(${item.itemId}, '${item.itemName}', ${item.itemPrice}, ${item.itemQuantity}, ${item.itemCost}, '${item.itemDescription || ''}')">
                    <td>${item.itemId}</td>
                    <td>${item.itemName}</td>
                    <td>Rs. ${item.itemPrice.toFixed(2)}</td>
                    <td>${item.itemQuantity}</td>
                    <td>Rs. ${item.itemCost.toFixed(2)}</td>
                    <td>${item.itemDescription || '-'}</td>
                </tr>`;
                tbody.append(row);
            });
        },
        error: function(xhr) {
            console.error("Error loading items");
        }
    });
}

function populateForm(id, name, price, quantity, cost, description) {
    $('#itemId').val(id);
    $('#itemName').val(name);
    $('#itemPrice').val(price);
    $('#itemQuantity').val(quantity);
    $('#itemCost').val(cost);
    $('#itemDescription').val(description);
}

$(document).ready(function() {
    loadItems();
});