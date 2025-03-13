package com.milo.shopping_software.controller;
import com.milo.shopping_software.model.Product;
import com.milo.shopping_software.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;


    @PostMapping
   public Product add(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @CrossOrigin
    @GetMapping
    public List<Product> getAll() {
        return productRepository.findAll();
    }


    @PutMapping
    public Product update(@RequestBody Product product) {
        return productRepository.save(product);
    }


    @DeleteMapping
    public void delete(@RequestBody Product product) {
        productRepository.delete(product);
    }


}
