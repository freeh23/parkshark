package com.switchfully.parkshark.dto;

import java.time.LocalDate;

public class MemberDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String email;
    private String licensePlateNumber;
    private String registrationDate;


    public MemberDTO() {
    }

    public MemberDTO withId(String id) {
        this.id = id;
        return this;
    }

    public MemberDTO withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public MemberDTO withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public MemberDTO withTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }

    public MemberDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    public MemberDTO withlicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
        return this;
    }

    public MemberDTO withRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    public MemberDTO build(){
        return this;
    }
}
