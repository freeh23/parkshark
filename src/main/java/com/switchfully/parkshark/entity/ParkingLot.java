package com.switchfully.parkshark.entity;



import javax.persistence.*;

@Entity
@Table(name = "ParkingLot")
public class ParkingLot {

    @Id
//    @SequenceGenerator(name = "persons_person_id_seq", sequenceName = "PERSONS_PERSON_id_SEQ", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "persons_person_id_seq")
    @Column(name = "pl_id")
    private int parkingLotId;

    @Column(name = "pl_name")
    private String name;

    @Column(name = "pl_max_cap")
    private int maxCapacity;

    @Column(name = "pl_price_hour")
    private double hourlyPrice;

    @OneToOne
    @JoinColumn(name="pl_cat_id")
    private Category category;

    @OneToOne
    @JoinColumn(name = "pl_address_id")
    private Address address;

//    @OneToOne
//    @JoinColumn(name = "pl_contact_id")
//    private Employee employee;
//
//    @ManyToOne
//    @JoinColumn(name = "pl_div_id")
//    private Division division;

    public ParkingLot() {
    }

    public ParkingLot(String name, int maxCapacity, double hourlyPrice, Category category, Address address) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.hourlyPrice = hourlyPrice;
        this.category = category;
        this.address = address;
    }
}
