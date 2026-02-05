let cId=$('#customerId').val();
let cName=$('#customerName').val()
let cAdress=$('#customerAdress').val()

console.log(cId,cName,cAdress);

$.ajax({
    url:"http://localhost:8080/api/v1/customer",
    method: "POST",
    contentType: "application/json",
    "data": JSON.stringify({
        "cId": "C001",
        "cName": "saumya",
        "cAddress": "Panadura"
    }),
    success: function(response) {
        console.log("Customer saved successfully!");
        alert("Customer Saved!");
    },
    error: function(xhr, status, error) {
        console.error(xhr.responseText);
        alert("Error saving customer!");
    }
});

