package lk.ijse.aad.backend.dto;


import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CustomerDTO {

//    @NotNull(message = "Customer ID is required")
    private Integer cId;

    @NotBlank(message = "Customer name is mandatory")
    private String cName;

    @NotBlank(message = "Address is mandatory")
    @Size(min = 10, message = "Address must be at least 10 chars")
    private String cAddress;

    private String cPhone;
}
