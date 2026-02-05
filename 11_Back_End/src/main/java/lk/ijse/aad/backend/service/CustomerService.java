package lk.ijse.aad.backend.service;

import lk.ijse.aad.backend.dto.CustomerDTO;

public interface CustomerService {
    public void saveCustomer(CustomerDTO customerDTO);
    void updateCustomer(CustomerDTO customerDTO);
    void deleteCustomer(String customerId);
    CustomerDTO getCustomer();
}
