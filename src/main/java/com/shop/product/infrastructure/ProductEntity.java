package com.shop.product.infrastructure;

import com.shop.product.domain.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    private String description;

    @Builder
    public ProductEntity(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static ProductEntity from(Product product) {
        return ProductEntity.builder()
                .name(product.name())
                .description(product.description())
                .build();
    }

    public Product toModel() {
        return Product.builder()
                .id(id)
                .name(name)
                .description(description)
                .build();
    }
}
