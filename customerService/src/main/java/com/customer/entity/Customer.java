package com.customer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer_master")
@Entity
public class Customer {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @JsonProperty
    @Column(name = "customer_name")
    private String customerName;

    @JsonProperty
    @Column(name = "mobile_number")
    private String mobileNumber;

    @JsonProperty
    @Column(name = "email")
    private String email;

    @JsonProperty
    @Column(name = "location")
    private String location;
}
