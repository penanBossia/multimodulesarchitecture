package com.penaboss.data;

import java.util.List;

import com.penaboss.data.mapper.ProductMapper;
import com.penaboss.services.ProductDao;
import com.penaboss.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.penaboss.data.entities.Product;

@Component
public class ProductDaoImpl implements ProductDao {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Autowired
    public ProductDaoImpl(final ProductRepository productRepository,
                          final ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductDto> findAll() {
        final List<Product> products = productRepository.findAll();
        return productMapper.mapFromProduct(products);
    }
}
