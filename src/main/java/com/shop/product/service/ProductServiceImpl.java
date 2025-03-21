package com.shop.product.service;

import com.shop.product.domain.Product;
import com.shop.product.domain.ProductCreate;
import com.shop.product.presentation.port.ProductService;
import com.shop.product.service.port.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    
    private final ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(ProductCreate productCreate) {
        Product product = Product.builder()
                .name(productCreate.name())
                .description(productCreate.description())
                .build();
        productRepository.save(product);
    }
}
