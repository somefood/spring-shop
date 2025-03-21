package com.shop.product.service.port;

import com.shop.product.domain.Product;

import java.util.List;

public interface ProductRepository {
    
    List<Product> findAll();

    void save(Product product);
}
