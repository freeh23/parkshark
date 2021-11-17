package com.switchfully.parkshark.dto;

import com.switchfully.parkshark.entity.Address;
import com.switchfully.parkshark.entity.ParkingLot;

public class CreateEmployeeDTO {
    private final String firstName;
    private final String lastName;
    private final String mobileNumber;
    private final String telephoneNumber;
    private final Address address;
    private final String email;
    private final String empTitle;

    private CreateEmployeeDTO(String firstName, String lastName, String mobileNumber, String telephoneNumber, Address address, String email, String empTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
        this.email = email;
        this.empTitle = empTitle;

    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }


    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
    public String getEmpTitle() {
        return empTitle;
    }


    public static final class CreateEmployeeDTOBuilder {
        private String firstName;
        private String lastName;
        private String mobileNumber;
        private String telephoneNumber;
        private Address address;
        private String email;
        private String empTitle;

        private CreateEmployeeDTOBuilder() {
        }

        public static CreateEmployeeDTOBuilder aCreateEmployeeDTO() {
            return new CreateEmployeeDTOBuilder();
        }

        public CreateEmployeeDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CreateEmployeeDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CreateEmployeeDTOBuilder withMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public CreateEmployeeDTOBuilder withTelephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public CreateEmployeeDTOBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public CreateEmployeeDTOBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public CreateEmployeeDTOBuilder withEmpTitle(String empTitle) {
            this.empTitle = empTitle;
            return this;
        }

        public CreateEmployeeDTO build() {
            return new CreateEmployeeDTO(firstName, lastName, mobileNumber, telephoneNumber, address, email, empTitle);
        }
    }
}
