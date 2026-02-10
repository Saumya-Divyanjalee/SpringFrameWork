package lk.ijse.aad.backend.service.custom;

import lk.ijse.aad.backend.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    void saveOrder(OrderDTO orderDTO);
    List<OrderDTO> getAllOrders();
    OrderDTO getOrderById(String id);
    void updateOrder(String id, OrderDTO orderDTO);
    void deleteOrder(String id);
    List<OrderDTO> getOrdersByCustomer(String customerId);
    List<OrderDTO> getOrderHistory();
}