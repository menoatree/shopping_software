package com.milo.shopping_software.controller;

import com.milo.shopping_software.model.Supplier;
import com.milo.shopping_software.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Supplier")
public class SupplierController {

    @Autowired
    SupplierRepository supplierRepository;


    @PostMapping
    public Supplier create(@RequestBody Supplier supplier) {
        return supplierRepository.save(supplier);
    }


    @GetMapping
    public List<Supplier> getAll() {
        return supplierRepository.findAll();
    }

    @PutMapping
    public Supplier update(@RequestBody Supplier supplier) {
        return supplierRepository.save(supplier);
    }


    @DeleteMapping
    public void delete(@RequestBody Supplier supplier) {
        supplierRepository.delete(supplier);
    }

}
