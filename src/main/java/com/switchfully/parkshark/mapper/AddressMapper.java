package com.switchfully.parkshark.mapper;

import com.switchfully.parkshark.dto.CreateAddressDTO;
import com.switchfully.parkshark.entity.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public Address toAddress(CreateAddressDTO dto){
        return new Address.Builder()
                .withStreet(dto.getStreet())
                .withCity(dto.getCity())
                .withHouseNumber(dto.getHouseNumber())
                .withZipcode(dto.getZipcode())
                .build();
    }

}
