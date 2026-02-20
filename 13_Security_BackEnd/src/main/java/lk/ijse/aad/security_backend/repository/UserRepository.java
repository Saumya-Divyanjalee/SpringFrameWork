package lk.ijse.aad.security_backend.repository;

import lk.ijse.aad.security_backend.entity.Role;
import lk.ijse.aad.security_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);


    // custom query
//    @Query(value = "select * from User where id = ?",nativeQuery = true)
//    Optional<User> findByUsername(String username);


    //@Modifying - custom update query
    // @Query(value = "select * from User where id = ?",nativeQuery = true)
    //Optional<User> findByUsername(String username);
}
