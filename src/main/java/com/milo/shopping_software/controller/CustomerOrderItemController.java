package com.milo.shopping_software.controller;



import com.milo.shopping_software.model.CustomerOrderItem;
import com.milo.shopping_software.repository.CustomerOrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Customer/Order/Item")
public class CustomerOrderItemController {

    @Autowired
    CustomerOrderItemRepository customerOrderItemRepository;

    @PostMapping
    public CustomerOrderItem create(@RequestBody CustomerOrderItem customerOrderItem) {
        return customerOrderItemRepository.save(customerOrderItem);
    }

    @GetMapping
    public List<CustomerOrderItem> findAll() {
        return customerOrderItemRepository.findAll();
    }

    @PutMapping
    public CustomerOrderItem update(@RequestBody CustomerOrderItem customerOrderItem) {
        return customerOrderItemRepository.save(customerOrderItem);
    }

    @DeleteMapping
    public void delete(@RequestBody CustomerOrderItem customerOrderItem) {
        customerOrderItemRepository.delete(customerOrderItem);
    }

}
