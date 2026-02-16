// Function to save item
function saveItem() {
    let itemName = $('#itemName').val();
    let itemPrice = parseFloat($('#itemPrice').val());
    let itemQuantity = parseInt($('#itemQuantity').val());
    let itemCost = parseFloat($('#itemCost').val()) || 0;
    let itemDescription = $('#itemDescription').val();

    // Validation
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
            "itemName": itemName,
            "itemPrice": itemPrice,
            "itemQuantity": itemQuantity,
            "itemCost": itemCost,
            "itemDescription": itemDescription
        }),
        success: function(response) {
            console.log("Item saved successfully!");
            alert("Item Saved Successfully!");
            clearForm();
            loadItems();
        },
        error: function(xhr, status, error) {
            console.error(xhr.responseText);
            let errorMsg = "Error saving item!";
            if (xhr.responseJSON && xhr.responseJSON.message) {
                errorMsg = xhr.responseJSON.message;
            }
            alert(errorMsg);
        }
    });
}

// Function to update item
function updateItem() {
    let itemId = $('#itemId').val();
    let itemName = $('#itemName').val();
    let itemPrice = parseFloat($('#itemPrice').val());
    let itemQuantity = parseInt($('#itemQuantity').val());
    let itemCost = parseFloat($('#itemCost').val()) || 0;
    let itemDescription = $('#itemDescription').val();

    // Validation
    if (!itemId) {
        alert("Please select an item to update!");
        return;
    }

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
        url: "http://localhost:8080/api/v1/item/" + itemId,
        method: "PUT",
        contentType: "application/json",
        data: JSON.stringify({
            "itemName": itemName,
            "itemPrice": itemPrice,
            "itemQuantity": itemQuantity,
            "itemCost": itemCost,
            "itemDescription": itemDescription
        }),
        success: function(response) {
            alert("Item Updated Successfully!");
            clearForm();
            loadItems();
        },
        error: function(xhr, status, error) {
            console.error(xhr.responseText);
            let errorMsg = "Error updating item!";
            if (xhr.responseJSON && xhr.responseJSON.message) {
                errorMsg = xhr.responseJSON.message;
            }
            alert(errorMsg);
        }
    });
}

// Function to delete item
function deleteItem() {
    let itemId = $('#itemId').val();

    if (!itemId) {
        alert("Please select an item to delete!");
        return;
    }

    if (confirm("Are you sure you want to delete item " + itemId + "?")) {
        $.ajax({
            url: "http://localhost:8080/api/v1/item/" + itemId,
            method: "DELETE",
            success: function(response) {
                alert("Item Deleted Successfully!");
                clearForm();
                loadItems();
            },
            error: function(xhr, status, error) {
                console.error(xhr.responseText);
                let errorMsg = "Error deleting item!";
                if (xhr.responseJSON && xhr.responseJSON.message) {
                    errorMsg = xhr.responseJSON.message;
                }
                alert(errorMsg);
            }
        });
    }
}

// Function to load all items
function loadItems() {
    $.ajax({
        url: "http://localhost:8080/api/v1/item",
        method: "GET",
        success: function(response) {
            let tbody = $('#itemTableBody');
            tbody.empty();

            // Handle APIResponse wrapper
            let items = response.data || response;

            items.forEach(function(item) {
                let row = `<tr onclick="populateForm(${item.itemId}, '${escapeHtml(item.itemName)}', ${item.itemPrice}, ${item.itemQuantity}, ${item.itemCost}, '${escapeHtml(item.itemDescription || '')}')">
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
        error: function(xhr, status, error) {
            console.error("Error loading items: " + xhr.responseText);
            alert("Error loading items!");
        }
    });
}

// Function to populate form when clicking on table row
function populateForm(id, name, price, quantity, cost, description) {
    $('#itemId').val(id);
    $('#itemName').val(name);
    $('#itemPrice').val(price);
    $('#itemQuantity').val(quantity);
    $('#itemCost').val(cost);
    $('#itemDescription').val(description);
}

// Function to clear form
function clearForm() {
    $('#itemForm')[0].reset();
    $('#itemId').val('');
}

// Utility function to escape HTML
function escapeHtml(text) {
    if (!text) return '';
    return text.replace(/'/g, "\\'");
}

// Load items when page loads
$(document).ready(function() {
    loadItems();

    // Add input validation for numeric fields
    $('#itemPrice, #itemCost').on('input', function() {
        this.value = this.value.replace(/[^0-9.]/g, '');
        const parts = this.value.split('.');
        if (parts.length > 2) {
            this.value = parts[0] + '.' + parts.slice(1).join('');
        }
    });

    $('#itemQuantity').on('input', function() {
        this.value = this.value.replace(/[^0-9]/g, '');
    });
});