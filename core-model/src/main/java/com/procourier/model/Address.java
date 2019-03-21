package com.procourier.model;

import java.util.Objects;

public final class Address {
    private String region;
    private String street;
    private String city;
    private String streetNumber;

    public Address(String region, String street, String city, String streetNumber) {
        this.region = Objects.requireNonNull(region);
        this.street = Objects.requireNonNull(street);
        this.city = Objects.requireNonNull(city);
        this.streetNumber =  Objects.requireNonNull(streetNumber);
    }

    public Address(String region, String street, String city) {
        this(region,street,city,"");
    }

    public String getRegion() {
        return region;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

}
