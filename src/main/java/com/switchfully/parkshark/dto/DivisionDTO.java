package com.switchfully.parkshark.dto;

import com.switchfully.parkshark.entity.Division;
import com.switchfully.parkshark.entity.Employee;

public class DivisionDTO {

    private final int id;
    private final String name;
    private final String originalName;
    private final Employee employee;
    private final Division division;

    public DivisionDTO(int id, String name, String originalName, Employee employee, Division division) {
        this.id = id;
        this.name = name;
        this.originalName = originalName;
        this.employee = employee;
        this.division = division;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOriginalName() {
        return originalName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Division getDivision() {
        return division;
    }

    public static class DivisionDTOBuilder {
        private int id;
        private String name;
        private String originalName;
        private Employee employee;
        private Division division;

        public DivisionDTOBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public DivisionDTOBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public DivisionDTOBuilder setOriginalName(String originalName) {
            this.originalName = originalName;
            return this;
        }

        public DivisionDTOBuilder setEmployee(Employee employee) {
            this.employee = employee;
            return this;
        }

        public DivisionDTOBuilder setDivision(Division division) {
            this.division = division;
            return this;
        }

        public DivisionDTO build(){
            return new DivisionDTO(this.id, this.name, this.originalName, this.employee, this.division);
        }
    }
}
