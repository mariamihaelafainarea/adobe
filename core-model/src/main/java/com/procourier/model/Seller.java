package com.procourier.model;

import java.util.Objects;

public final class Seller {
    private String name;
    private Address location;
    private String description;

    public Seller(String name, Address location, String description) {
        this.name = Objects.requireNonNull(name);
        this.location = Objects.requireNonNull(location);
        this.description = Objects.requireNonNull(description);;
    }
    public Seller(String name, Address location) {
        this(name,location,"");
    }

    public String getName() {
        return name;
    }

    public Address getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }
}
