package lk.ijse.aad.backend.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data // Using @Data simplifies things
public class ItemDTO {
    private Integer itemId; // Changed from String to Integer

    @NotBlank(message = "Item name is mandatory")
    private String itemName;

    @NotNull(message = "Item price is required")
    @Min(value = 0, message = "Price cannot be negative")
    private double itemPrice;

    @NotNull(message = "Item quantity is required")
    @Min(value = 0, message = "Quantity cannot be negative")
    private int itemQuantity;

    @NotNull(message = "Item cost is required")
    @Min(value = 0, message = "Cost cannot be negative")
    private double itemCost;

    @Size(max = 255, message = "Description too long")
    private String itemDescription;
}