package com.penaboss.services;

import java.util.List;

import com.penaboss.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements IProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductServiceImpl(final ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<ProductDto> findAllProducts() {
        return productDao.findAll();
    }
}
