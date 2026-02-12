package lk.ijse.aad.backend.controller;

import lk.ijse.aad.backend.dto.CustomerDTO;
import lk.ijse.aad.backend.service.custom.CustomerService;
import lk.ijse.aad.backend.util.APIResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {

    private final CustomerService customerService;

    // POST endpoint to save customer
    @PostMapping
    public ResponseEntity<APIResponse<String>> saveCustomer(@RequestBody CustomerDTO customerDTO) {
         
        customerService.saveCustomer(customerDTO);
        return new ResponseEntity<>(
                new APIResponse<>(201, "Customer saved", null),
                HttpStatus.CREATED
        );
//        return ResponseEntity.ok("Customer saved successfully");

    }

    // GET endpoint to retrieve all customers
    @GetMapping
    public ResponseEntity<List<CustomerDTO>> getAllCustomers() {
        List<CustomerDTO> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }

    // GET endpoint to retrieve a customer by ID
    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable String id) {
        CustomerDTO customer = customerService.getCustomerById(id);
        return ResponseEntity.ok(customer);
    }

    // PUT endpoint to update customer
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCustomer(@PathVariable String id, @RequestBody CustomerDTO customerDTO) {
        customerService.updateCustomer(id, customerDTO);
        return ResponseEntity.ok("Customer updated successfully");
    }

    // DELETE endpoint to delete customer
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable String id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.ok("Customer deleted successfully");
    }
}