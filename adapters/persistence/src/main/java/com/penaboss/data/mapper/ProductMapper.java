package com.penaboss.data.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.penaboss.dto.ProductDto;
import com.penaboss.data.entities.Product;

@Mapper(componentModel="spring")
public interface ProductMapper {

    List<ProductDto> mapFromProduct(List<Product> productList);
}
