package com.shop.product.infrastructure;

import com.shop.product.domain.Product;
import com.shop.product.service.port.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    
    private final ProductJpaRepository productJpaRepository;

    @Override
    public List<Product> findAll() {
        return productJpaRepository.findAll()
                .stream()
                .map(ProductEntity::toModel)
                .toList();
    }

    @Override
    public void save(Product product) {
        ProductEntity productEntity = ProductEntity.from(product);
        productJpaRepository.save(productEntity);
    }
}
