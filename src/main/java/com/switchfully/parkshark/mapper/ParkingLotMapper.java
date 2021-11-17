package com.switchfully.parkshark.mapper;

import com.switchfully.parkshark.dto.CreateParkingLotDTO;
import com.switchfully.parkshark.entity.ParkingLot;
import org.springframework.stereotype.Component;

@Component
public class ParkingLotMapper {

    public ParkingLot mapCreateParkingLotDTOToParkingLot(CreateParkingLotDTO createParkingLotDTO) {

        return new ParkingLot(createParkingLotDTO.getName(),createParkingLotDTO.getMaxCapacity(),
                createParkingLotDTO.getHourlyPrice(), createParkingLotDTO.getCategory(), createParkingLotDTO.getAddress());
    }
}
