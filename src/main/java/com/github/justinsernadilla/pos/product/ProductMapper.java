package com.github.justinsernadilla.pos.product;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ProductMapper implements Function<Product, ProductResponse> {
    @Override
    public ProductResponse apply(Product product) {
        return new ProductResponse(
                product.getProductId(),
                product.getName(),
                product.getDescription(),
                product.getCategory(),
                product.getPrice(),
                product.getCostPrice(),
                product.getStockQuantity(),
                product.getLowQuantityThreshold(),
                product.getTrackInventory()
        );
    }
}
