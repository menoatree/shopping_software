package com.milo.shopping_software.controller;

import com.milo.shopping_software.model.SupplierOrder;
import com.milo.shopping_software.repository.SupplierOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Supplier/Order")
public class SupplierOrderController {

    @Autowired
    SupplierOrderRepository supplierOrderRepository;

    @PostMapping
    public SupplierOrder save(@RequestBody SupplierOrder supplierOrder) {
        return supplierOrderRepository.save(supplierOrder);
    }

    @GetMapping
    public List<SupplierOrder> findAll() {
        return supplierOrderRepository.findAll();
    }

    @PutMapping
    public SupplierOrder update(@RequestBody SupplierOrder supplierOrder) {
        return supplierOrderRepository.save(supplierOrder);
    }

    @DeleteMapping
    public void delete(@RequestBody SupplierOrder supplierOrder) {
        supplierOrderRepository.delete(supplierOrder);
    }

}
