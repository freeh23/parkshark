package com.switchfully.parkshark.mapper;

import com.switchfully.parkshark.dto.createLicensePlateDTO;
import com.switchfully.parkshark.entity.LicensePlate;
import org.springframework.stereotype.Component;

@Component
public class LicensePlateMapper {

    public LicensePlate toLicensePlate(createLicensePlateDTO dto){
        return new LicensePlate.Builder()
                .withLicensePlateNumber(dto.getLicensePlateNumber())
                .withLicensePlateCountry(dto.getLicensePlateCountry())
                .build();

    }

}
