package com.github.justinsernadilla.pos.transaction;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_seq")
    @SequenceGenerator(name = "transaction_seq", sequenceName =  "transaction_seq", allocationSize = 1)
    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(nullable = false,
            scale = 2)
    private BigDecimal subtotal;

    @Column(name = "tax_amount",
            nullable = false,
            scale = 2)
    private BigDecimal taxAmount = BigDecimal.ZERO;

    @Column(name = "discount_amount",
            nullable = false,
            scale = 2)
    private BigDecimal discountAmount = BigDecimal.ZERO;

    @Column(name = "total_amount",
            nullable = false,
            scale = 2)
    private BigDecimal totalAmount;

    @Column(name = "amount_tendered",
            nullable = false,
            scale = 2)
    private BigDecimal amountTendered;

    @Column(name = "change_amount",
            nullable = false,
            scale = 2)
    private BigDecimal changeAmount;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "transaction_status",
            nullable = false)
    private TransactionStatus transactionStatus = TransactionStatus.PENDING;

    protected Transaction() {}

    @PrePersist
    private void setCreatedAt() {
        this.createdAt = LocalDateTime.now();
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setAmountTendered(BigDecimal amountTendered) {
        this.amountTendered = amountTendered;
    }

    public void setChangeAmount(BigDecimal changeAmount) {
        this.changeAmount = changeAmount;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public BigDecimal getAmountTendered() {
        return amountTendered;
    }

    public BigDecimal getChangeAmount() {
        return changeAmount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }
}
