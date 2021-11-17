package com.switchfully.parkshark.dto;

import java.time.LocalDate;

public class CreateMemberDTO {
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String email;
    private String licensePlateNumber;
    private String licensePlateCountry;
    private LocalDate registrationDate;

    public CreateMemberDTO() {
        this.registrationDate = LocalDate.now();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getLicensePlateCountry() {
        return licensePlateCountry;
    }

    public void setLicensePlateCountry(String licensePlateCountry) {
        this.licensePlateCountry = licensePlateCountry;
    }
}
