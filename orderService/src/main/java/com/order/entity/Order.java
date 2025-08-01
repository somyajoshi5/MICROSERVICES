package com.order.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_master")
@Entity
public class Order {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @JsonProperty
    @Column(name = "product_name")
    private String productName;

    @JsonProperty
    @Column(name = "price")
    private String price;

    @JsonProperty
    @Column(name = "customer_id")
    private Long customerId;
}
