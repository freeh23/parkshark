package com.switchfully.parkshark.service;

import com.switchfully.parkshark.dto.CreateParkingLotDTO;
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


    public void createParkingLot(CreateParkingLotDTO createParkingLotDTO) {
        //ParkingLot parkingLot = parkingLotMapper.mapCreateParkingLotDTOToParkingLot(createParkingLotDTO);

        //return parkingLotRepository.save(parkingLot);
    }
}
