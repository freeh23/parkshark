package com.switchfully.parkshark.dto;

import com.switchfully.parkshark.entity.Division;
import com.switchfully.parkshark.entity.Employee;

public class CreateDivisionDTO {

    private final String name;
    private final String originalName;
    private final Employee director;
    private final Division division;

    public CreateDivisionDTO(String name, String originalName, Employee director, Division division) {
        this.name = name;
        this.originalName = originalName;
        this.director = director;
        this.division = division;
    }

    public String getName() {
        return name;
    }

    public String getOriginalName() {
        return originalName;
    }

    public Employee getDirector() {
        return director;
    }

    public Division getDivision() {
        return division;
    }
}
