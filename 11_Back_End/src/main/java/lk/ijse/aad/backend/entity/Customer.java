package lk.ijse.aad.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private Integer cId;

    @Column(name = "c_name")
    private String cName;

    @Column(name = "c_address")
    private String cAddress;

    @Column(name = "c_phone")
    private String cPhone;
}
//        | Strategy | How ID is generated          | Use case            |
//        | -------- | ---------------------------- | ------------------- |
//        | AUTO     | JPA decides based on DB      | Simple apps         |
//        | IDENTITY | DB auto-increment on insert  | MySQL, easy         |
//        | SEQUENCE | DB sequence object           | PostgreSQL, Oracle  |
//        | TABLE    | Special table stores last ID | DB-independent      |
//        | UUID     | Random unique string         | Distributed systems |
