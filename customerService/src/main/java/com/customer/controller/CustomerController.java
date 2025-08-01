package com.customer.controller;

import com.customer.entity.Customer;
import com.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @GetMapping("/getall")
    public ResponseEntity<List<Customer>> getAllEmployees() {
        List<Customer> empList = repo.findAll();
        return ResponseEntity.ok(empList);
    }
}