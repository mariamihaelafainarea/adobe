package com.procourier.model;

public final class Buyer {
    private String name;
    private Address address;

    public Buyer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
