package com.milo.shopping_software.controller;



import com.milo.shopping_software.model.CustomerOrder;
import com.milo.shopping_software.repository.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Customer/Order/")
public class CustomerOrderController {

    @Autowired
    CustomerOrderRepository customerOrderRepository;
    @CrossOrigin
    @PostMapping
    public CustomerOrder create(@RequestBody CustomerOrder customerOrder) {
        return customerOrderRepository.save(customerOrder);
    }

    @GetMapping
    public List<CustomerOrder> findAll() {
        return customerOrderRepository.findAll();
    }

    @PutMapping
    public CustomerOrder update(@RequestBody CustomerOrder customerOrder) {
        return customerOrderRepository.save(customerOrder);
    }

    @DeleteMapping
    public void delete(@RequestBody CustomerOrder customerOrder) {
        customerOrderRepository.delete(customerOrder);
    }
}
