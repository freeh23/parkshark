package com.switchfully.parkshark.entity;

import javax.persistence.*;

@Entity
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "cat_id")
    private int id;

    @Column(name = "cat_name")
    private String categoryName;

    public Category() {
    }
}
