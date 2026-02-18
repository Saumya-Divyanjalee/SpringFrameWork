package lk.ijse.aad.backend.service.custom;

import lk.ijse.aad.backend.dto.ItemDTO;
import java.util.List;

public interface ItemService {
    void saveItem(ItemDTO itemDTO);
    List<ItemDTO> getAllItems();
    ItemDTO getItemById(Integer id);
    void updateItem(Integer id, ItemDTO itemDTO);
    void deleteItem(Integer id);

}