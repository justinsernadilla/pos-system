package com.github.justinsernadilla.pos.product;

import java.math.BigDecimal;

public record ProductResponse(
        Long productId,
        String name,
        String description,
        String category,
        BigDecimal price,
        BigDecimal costPrice,
        Integer stockQuantity,
        Integer lowQuantityThreshold,
        Boolean trackInventory
) {}
