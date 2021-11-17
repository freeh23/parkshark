package com.switchfully.parkshark.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.util.Objects;

//Address en licenseplate entity nog nodig.

@Entity
@Table(name = "member")
public class Member {

    public enum MembershipLevel {BRONZE,SILVER,GOLD}

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "mem_id", nullable = false)
    private Integer memberId;

    @Column(name = "mem_firstname")
    private String firstName;

    @Column(name = "mem_lastname")
    private String lastName;

    @OneToOne
    @JoinColumn(name = "mem_address_id")
    private Address address;

    @Column(name = "mem_email_address")
    @Email
    private String email;

    @Column(name = "mem_reg_date",columnDefinition = "DATE")
    private LocalDate registrationDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mem_lp_id")
    private LicensePlate licensePlate;

    @JoinColumn(name = "mem_lp_id")
    @Enumerated(EnumType.STRING)
    private MembershipLevel membershipLevel;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member member = (Member) o;
        return getMemberId().equals(member.getMemberId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMemberId());
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LicensePlate getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(LicensePlate licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
}
