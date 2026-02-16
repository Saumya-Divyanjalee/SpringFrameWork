package lk.ijse.aad.backend.repository;

import lk.ijse.aad.backend.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    // Changed from <Item, String> to <Item, Integer>
}