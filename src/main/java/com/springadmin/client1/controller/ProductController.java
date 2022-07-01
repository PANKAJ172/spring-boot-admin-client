package com.springadmin.client1.controller;

import com.springadmin.client1.model.Product;
import com.springadmin.client1.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author PANKAJ JANGID
 * @created 21/06/2022 - 12:18 AM
 */
@RestController
@Slf4j
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/products")
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/products")
    public List<Product> findAll() {
        log.info("find products");
        return productRepository.findAll();
    }

}
