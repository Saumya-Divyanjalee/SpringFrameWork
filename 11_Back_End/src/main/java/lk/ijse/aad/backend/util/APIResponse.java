package lk.ijse.aad.backend.util;


import lk.ijse.aad.backend.dto.CustomerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class APIResponse<T>{
    private int status;
    private String message;
    private T data;
}
