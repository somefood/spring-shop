package com.shop.product.presentation.response;

import com.shop.product.domain.Product;

public record ProductResponse(Long id, String name, String description) {
    
    public static ProductResponse from(Product product) {
        return new ProductResponse(
                product.id(),
                product.name(),
                product.description()
        );
    }
}
