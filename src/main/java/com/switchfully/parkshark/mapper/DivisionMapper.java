package com.switchfully.parkshark.mapper;

import com.switchfully.parkshark.dto.CreateDivisionDTO;
import com.switchfully.parkshark.dto.DivisionDTO;
import com.switchfully.parkshark.entity.Division;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class DivisionMapper {

    public List<DivisionDTO> toDtoList(List<Division> divisionList) {
        return divisionList.stream().map(this::toDtoDivision).collect(Collectors.toList());
    }

    public Division toEntityDivision(CreateDivisionDTO createDivisionDTO) {
        return new Division.DivisionBuilder()
                .setName(createDivisionDTO.getName())
                .setOriginalName(createDivisionDTO.getOriginalName())
                .setEmployee(createDivisionDTO.getDirector())
                .setDivision(createDivisionDTO.getDivision())
                .build();
    }

    public DivisionDTO toDtoDivision(Division division) {
        return new DivisionDTO.DivisionDTOBuilder()
                .setId(division.getId())
                .setName(division.getName())
                .setOriginalName(division.getOriginalName())
                .setEmployee(division.getDirector())
                .setDivision(division.getUpperDivision())
                .build();
    }

}
