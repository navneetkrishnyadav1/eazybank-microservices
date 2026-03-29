package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GenericGenerator(name = "native",strategy = "native")
    @Column(name ="customer_id")
    private Long customerId;
    private String name;
    private String email;
    private String mobileNumber;
}