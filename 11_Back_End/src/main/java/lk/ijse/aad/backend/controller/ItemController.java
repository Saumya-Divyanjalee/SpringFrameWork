package lk.ijse.aad.backend.controller;

import jakarta.validation.Valid;
import lk.ijse.aad.backend.dto.ItemDTO;
import lk.ijse.aad.backend.service.custom.ItemService;
import lk.ijse.aad.backend.util.APIResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")
@RequiredArgsConstructor
@CrossOrigin
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public ResponseEntity<APIResponse<String>> saveItem(@Valid @RequestBody ItemDTO itemDTO) {
        itemDTO.setItemId(null);  // Ensure auto-generation
        itemService.saveItem(itemDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new APIResponse<>(201, "Item created successfully", null));
    }

    @GetMapping
    public ResponseEntity<APIResponse<List<ItemDTO>>> getAllItems() {
        return ResponseEntity.ok(new APIResponse<>(200, "Success", itemService.getAllItems()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<APIResponse<ItemDTO>> getItemById(@PathVariable Integer id) {
        return ResponseEntity.ok(new APIResponse<>(200, "Success", itemService.getItemById(id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<APIResponse<String>> updateItem(@PathVariable Integer id,
                                                          @Valid @RequestBody ItemDTO itemDTO) {
        itemService.updateItem(id, itemDTO);
        return ResponseEntity.ok(new APIResponse<>(200, "Item updated successfully", null));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<APIResponse<String>> deleteItem(@PathVariable Integer id) {
        itemService.deleteItem(id);
        return ResponseEntity.ok(new APIResponse<>(200, "Item deleted successfully", null));
    }
}