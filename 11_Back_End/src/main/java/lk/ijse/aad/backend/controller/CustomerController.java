package lk.ijse.aad.backend.controller;

import lk.ijse.aad.backend.dto.CustomerDTO;
import lk.ijse.aad.backend.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer") // corrected "vi" -> "v1" use nouns
@RequiredArgsConstructor // Lombok will generate constructor for final fields
@CrossOrigin
public class CustomerController {

    // Use interface type, final field → constructor injection by Lombok
    private final CustomerService customerService;

    // POST endpoint to save customer
    @PostMapping
    public void saveCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);

        // Optional: debug logs (remove in production)
//        System.out.println("saveCustomer called");
//        System.out.println(customerDTO.getCId());
//        System.out.println(customerDTO.getCName());
//        System.out.println(customerDTO.getCAddress());
    }
}
