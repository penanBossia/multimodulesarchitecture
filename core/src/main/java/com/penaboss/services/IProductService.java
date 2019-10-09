package com.penaboss.services;

import com.penaboss.dto.ProductDto;

import java.util.List;

public interface IProductService {

    List<ProductDto> findAllProducts();
}
