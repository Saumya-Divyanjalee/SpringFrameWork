package lk.ijse.aad.security_backend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatusCode;

@Data
@AllArgsConstructor

public class APIResponse{
    private int status;
    private String message;
    private Object data;
}
