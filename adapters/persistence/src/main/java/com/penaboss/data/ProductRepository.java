package com.penaboss.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.penaboss.data.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
