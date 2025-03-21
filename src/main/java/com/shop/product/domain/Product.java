package com.shop.product.domain;

import lombok.Builder;

@Builder
public record Product(Long id, String name, String description) {
}
