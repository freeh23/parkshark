package com.switchfully.parkshark.entity;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "add_id")
    private int id;

    @Column(name = "add_street")
    private String street;

    @Column(name = "add_housenum")
    private String houseNumber;

    @Column(name = "add_zipcode")
    private String zipcode;

    @Column(name = "add_city")
    private String city;

    public Address() {

    }
}
