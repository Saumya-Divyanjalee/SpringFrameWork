package lk.ijse.aad.backend.service.custom;

import lk.ijse.aad.backend.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomerById(int id);
    void updateCustomer(int id, CustomerDTO customerDTO);
    void deleteCustomer(int id);
}