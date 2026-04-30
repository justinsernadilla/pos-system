package com.github.justinsernadilla.pos.product;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
    @SequenceGenerator(name = "product_seq", sequenceName = "product_seq", allocationSize = 1)
    @Column(name = "product_id")
    private Long productId;

    @Column(nullable = false, unique = true,
            length = 50)
    private String name;

    @Column(length = 50)
    private String description;

    @Column(length = 50)
    private String category;

    @Column(nullable = false,
            scale = 2)
    private BigDecimal price;

    @Column(name = "cost_price",
            nullable = false,
            scale = 2)
    private BigDecimal costPrice;

    @Column(name = "stock_quantity",
            nullable = false)
    private Integer stockQuantity = 0;

    @Column(name = "low_quantity_threshold")
    private Integer lowQuantityThreshold;

    @Column(name = "track_inventory",
            nullable = false)
    private Boolean trackInventory = false;

    protected Product() {}

    public Product(String name, BigDecimal price, BigDecimal costPrice) {
        this.name = name;
        this.price = price;
        this.costPrice = costPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void setLowQuantityThreshold(Integer lowQuantityThreshold) {
        this.lowQuantityThreshold = lowQuantityThreshold;
    }

    public void setTrackInventory(Boolean trackInventory) {
        this.trackInventory = trackInventory;
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public Integer getLowQuantityThreshold() {
        return lowQuantityThreshold;
    }

    public Boolean getTrackInventory() {
        return trackInventory;
    }
}
