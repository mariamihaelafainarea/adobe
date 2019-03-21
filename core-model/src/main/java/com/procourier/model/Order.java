package com.procourier.model;

import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
//mergem pe principiul ca toate obiectele sunt value object =>
//o data definite raman asa !
public final class Order {
    private Seller seller;
    private Buyer buyer;
    private Product product;
    private Courier courier;
    private Instant submittedDate;
    private Map<Product,Integer> orderLines = new HashMap<>();

    public Order(Seller seller, Buyer buyer, Product product, Courier courier, Instant submittedDate, Map<Product, Integer> orderLines) {
        this.seller = Objects.requireNonNull(seller);
        this.buyer = Objects.requireNonNull(buyer);
        this.product = Objects.requireNonNull(product);
        this.courier = Objects.requireNonNull(courier);
        this.submittedDate = Objects.requireNonNull(submittedDate);
        this.orderLines = Collections.unmodifiableMap(orderLines);
    }

    public Order(Seller seller, Buyer buyer, Product product, Courier courier, Map<Product, Integer> orderLines) {
        this(seller,buyer,product,courier,Instant.now(),orderLines);
    }
}
