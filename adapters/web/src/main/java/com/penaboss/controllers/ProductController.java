package com.penaboss.controllers;

import java.util.List;

import com.penaboss.services.IProductService;
import com.penaboss.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final IProductService productService;

    @Autowired
    public ProductController(final IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<ProductDto> getAllProducts() {
        return productService.findAllProducts();
    }
}
