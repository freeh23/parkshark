package com.switchfully.parkshark.dto;

import com.switchfully.parkshark.entity.Address;
import com.switchfully.parkshark.entity.Category;

public class CreateParkingLotDTO {


    private final String name;
    private final int maxCapacity;
    private final double hourlyPrice;
    private final Category category;
    private final Address address;

    public CreateParkingLotDTO(String name, int maxCapacity, double hourlyPrice, Category category, Address address) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.hourlyPrice = hourlyPrice;
        this.category = category;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public double getHourlyPrice() {
        return hourlyPrice;
    }

    public Category getCategory() {
        return category;
    }

    public Address getAddress() {
        return address;
    }

    public static final class CreateParkingLotDTOBuilder {
        private String name;
        private int maxCapacity;
        private double hourlyPrice;
        private Category category;
        private Address address;

        private CreateParkingLotDTOBuilder() {
        }

        public static CreateParkingLotDTOBuilder aCreateParkingLotDTO() {
            return new CreateParkingLotDTOBuilder();
        }

        public CreateParkingLotDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CreateParkingLotDTOBuilder withMaxCapacity(int maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        public CreateParkingLotDTOBuilder withHourlyPrice(double hourlyPrice) {
            this.hourlyPrice = hourlyPrice;
            return this;
        }

        public CreateParkingLotDTOBuilder withCategory(Category category) {
            this.category = category;
            return this;
        }

        public CreateParkingLotDTOBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public CreateParkingLotDTO build() {
            return new CreateParkingLotDTO(name, maxCapacity, hourlyPrice, category, address);
        }
    }
}
