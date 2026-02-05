package lk.ijse.aad.backend.service.impl;

import lk.ijse.aad.backend.dto.CustomerDTO;
import lk.ijse.aad.backend.repository.CustomerRepository;
import lk.ijse.aad.backend.entity.Customer;
import lk.ijse.aad.backend.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public void saveCustomer(CustomerDTO customerDTO){
        customerRepository.save(
                new Customer(
                        customerDTO.getCId(),
                        customerDTO.getCName(),
                        customerDTO.getCAddress()));
    }

}
