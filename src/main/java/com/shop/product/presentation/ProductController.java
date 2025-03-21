package com.shop.product.presentation;

import com.shop.product.presentation.port.ProductService;
import com.shop.product.presentation.response.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/products")
@RestController
public class ProductController {
    
    private final ProductService productService;

    @GetMapping
    List<ProductResponse> getProducts() {
        return productService.findAll().stream()
                .map(ProductResponse::from)
                .toList();
    }
}
