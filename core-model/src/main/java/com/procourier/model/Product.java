package com.procourier.model;

import java.util.Objects;

public final class Product {
    private Long pret;
    private String name;
    private String description;
    private Long weight;

    public Product(Long pret, String name, String description, Long weight) {
        this.pret = Objects.requireNonNull(pret);
        this.name = Objects.requireNonNull(name);
        this.description = Objects.requireNonNull(description);
        this.weight = checkWeight(weight);
    }
    private static Long checkWeight(Long weight) {
        if(weight <= 0) {
            throw new IllegalArgumentException("Weight must be non negative!");
        }
        return Objects.requireNonNull(weight);
    }

    public Long getPret() {
        return pret;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getWeight() {
        return weight;
    }
}
