package com.shop.product.presentation.port;

import com.shop.product.domain.Product;
import com.shop.product.domain.ProductCreate;

import java.util.List;

public interface ProductService {
    
    List<Product> findAll();
    
    void save(ProductCreate product);
}
