package com.switchfully.parkshark.mapper;

import com.switchfully.parkshark.dto.CreateMemberDTO;
import com.switchfully.parkshark.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberMapper {
    private final AddressMapper addressMapper;
    private final LicensePlateMapper licensePlateMapper;

    @Autowired
    public MemberMapper(AddressMapper addressMapper, LicensePlateMapper licensePlateMapper) {
        this.addressMapper = addressMapper;
        this.licensePlateMapper = licensePlateMapper;
    }

    public Member toMember(CreateMemberDTO dto) {
        if dto.get

        return new Member.Builder()
                .withFirstName(dto.getFirstName())
                .withLastName(dto.getLastName())
                .withAddress(addressMapper.toAddress(dto.getAddress()))
                .withEmail(dto.getEmail())
                .withLicensePlate(licensePlateMapper.toLicensePlate(dto.getLicensePlateDTO()))
                .withTelephoneNumber()
    }
}
