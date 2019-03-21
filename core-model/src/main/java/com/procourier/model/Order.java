package com.procourier.model;

import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
//mergem pe principiul ca toate obiectele sunt value object =>
//o data definite raman asa !
public final class Order {
    private Long id;
    private Seller seller;
    private Buyer buyer;
    private Product product;
    private Courier courier;
    private Instant submittedDate;
    private Map<Product,Integer> orderLines = new HashMap<>();

    public Order(Long id,Seller seller, Buyer buyer, Product product, Courier courier, Instant submittedDate, Map<Product, Integer> orderLines) {
        this.id = Objects.requireNonNull(id);
        this.seller = Objects.requireNonNull(seller);
        this.buyer = Objects.requireNonNull(buyer);
        this.product = Objects.requireNonNull(product);
        this.courier = Objects.requireNonNull(courier);
        this.submittedDate = Objects.requireNonNull(submittedDate);
        this.orderLines = Collections.unmodifiableMap(orderLines);
    }

    public Order(Long id,Seller seller, Buyer buyer, Product product, Courier courier, Map<Product, Integer> orderLines) {
        this(id,seller,buyer,product,courier,Instant.now(),orderLines);
    }

    public Long getId() {
        return id;
    }

    public Seller getSeller() {
        return seller;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    public Courier getCourier() {
        return courier;
    }

    public Instant getSubmittedDate() {
        return submittedDate;
    }

    public Map<Product, Integer> getOrderLines() {
        return orderLines;
    }
}
