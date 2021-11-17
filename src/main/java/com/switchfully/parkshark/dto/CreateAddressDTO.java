package com.switchfully.parkshark.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class CreateAddressDTO {
    private String street;
    private String houseNumber;
    private String zipcode;
    private String city;

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
