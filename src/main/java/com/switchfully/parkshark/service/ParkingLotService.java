package com.switchfully.parkshark.service;

import com.switchfully.parkshark.dto.CreateParkingLotDTO;
import com.switchfully.parkshark.dto.ParkingLotDTO;
import com.switchfully.parkshark.entity.ParkingLot;
import com.switchfully.parkshark.mapper.ParkingLotMapper;
import com.switchfully.parkshark.repository.ParkingLotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ParkingLotService {

    private final ParkingLotRepository parkingLotRepository;
    private final ParkingLotMapper parkingLotMapper;

    @Autowired
    public ParkingLotService(ParkingLotRepository parkingLotRepository, ParkingLotMapper parkingLotMapper) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingLotMapper = parkingLotMapper;
    }


    public ParkingLotDTO createParkingLot(CreateParkingLotDTO createParkingLotDTO) {
        ParkingLot parkingLot = parkingLotMapper.toEntity(createParkingLotDTO);
        ParkingLot savedParkingLot = parkingLotRepository.save(parkingLot);
        return parkingLotMapper.toDTO(savedParkingLot);
    }
}
