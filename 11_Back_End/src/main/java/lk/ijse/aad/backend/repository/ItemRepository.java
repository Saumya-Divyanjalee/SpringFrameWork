package lk.ijse.aad.backend.repository;

import lk.ijse.aad.backend.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
    // Spring Data JPA automatically provides:
    // - save(Item)
    // - findAll()
    // - findById(String)
    // - deleteById(String)
    // - existsById(String)
    // And many more...
}