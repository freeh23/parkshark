package com.switchfully.parkshark.dto;

import com.switchfully.parkshark.entity.Member;

import java.time.LocalDate;

public class CreateMemberDTO {
    private String firstName;
    private String lastName;
    private CreateAddressDTO address;
    private String telephoneNumber;
    private String email;
    private createLicensePlateDTO licensePlateDTO;
    private Member.MembershipLevel membershipLevel;
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


    public String getTelephoneNumber() {
        return telephoneNumber;
    }



    public String getEmail() {
        return email;
    }


    public createLicensePlateDTO getLicensePlateDTO() {
        return licensePlateDTO;
    }


    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public CreateAddressDTO getAddress() {
        return address;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(CreateAddressDTO address) {
        this.address = address;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLicensePlateDTO(createLicensePlateDTO licensePlateDTO) {
        this.licensePlateDTO = licensePlateDTO;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Member.MembershipLevel getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(Member.MembershipLevel membershipLevel) {
        this.membershipLevel = membershipLevel;
    }
}
