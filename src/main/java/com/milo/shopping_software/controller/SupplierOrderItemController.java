package com.milo.shopping_software.controller;

import com.milo.shopping_software.model.SupplierOrderItem;
import com.milo.shopping_software.repository.SupplierOrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Supplier/Order/Item")
public class SupplierOrderItemController {

    @Autowired
    SupplierOrderItemRepository supplierOrderItemRepository;

    @PostMapping
    public SupplierOrderItem create(@RequestBody SupplierOrderItem supplierOrderItem) {
        return supplierOrderItemRepository.save(supplierOrderItem);
    }

    @GetMapping
    public List<SupplierOrderItem> findAll() {
        return supplierOrderItemRepository.findAll();
    }


    @PutMapping
    public SupplierOrderItem update(@RequestBody SupplierOrderItem supplierOrderItem) {
        return supplierOrderItemRepository.save(supplierOrderItem);
    }


    @DeleteMapping
    public void delete(@RequestBody SupplierOrderItem supplierOrderItem) {
        supplierOrderItemRepository.delete(supplierOrderItem);
    }



}
