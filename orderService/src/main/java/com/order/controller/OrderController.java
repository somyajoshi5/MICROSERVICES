package com.order.controller;

import com.order.entity.Order;
import com.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository repo;

    @GetMapping("/getall")
    public ResponseEntity<List<Order>> getAllEmployees() {
        List<Order> orderList = repo.findAll();
        return ResponseEntity.ok(orderList);
    }
}