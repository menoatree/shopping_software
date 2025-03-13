package com.milo.shopping_software.controller;


import com.milo.shopping_software.model.Customer;
import com.milo.shopping_software.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Customer")
public class CustomerController {

    @Autowired
     CustomerRepository customerRepository;

    @PostMapping
    public String create(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return "Customer created";
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @PutMapping
    public Customer update(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @DeleteMapping
    public void delete(@RequestBody Customer customer) {
        customerRepository.delete(customer);
    }
}
