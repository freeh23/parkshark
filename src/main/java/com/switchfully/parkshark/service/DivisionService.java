package com.switchfully.parkshark.service;

import com.switchfully.parkshark.dto.CreateDivisionDTO;
import com.switchfully.parkshark.dto.DivisionDTO;
import com.switchfully.parkshark.entity.Division;
import com.switchfully.parkshark.mapper.DivisionMapper;
import com.switchfully.parkshark.repository.DivisionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DivisionService {

    private final DivisionRepository divisionRepository;
    private final DivisionMapper divisionMapper;

    public DivisionService(DivisionRepository divisionRepository, DivisionMapper divisionMapper) {
        this.divisionRepository = divisionRepository;
        this.divisionMapper = divisionMapper;
    }

    public DivisionDTO save(CreateDivisionDTO createDivisionDTO){
        Division division = divisionMapper.toEntityDivision(createDivisionDTO);
        divisionRepository.save(division);
        return divisionMapper.toDtoDivision(division);
    }

    public List<DivisionDTO> getAllDivisions() {
        return divisionMapper.toDtoList((List<Division>) divisionRepository.findAll());
    }
}
