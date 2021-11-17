package com.switchfully.parkshark.mapper;

import com.switchfully.parkshark.dto.CreateMemberDTO;
import com.switchfully.parkshark.dto.MemberDTO;
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
        if (dto.getMembershipLevel() == null) {
            return new Member.Builder()
                    .withFirstName(dto.getFirstName())
                    .withLastName(dto.getLastName())
                    .withAddress(addressMapper.toAddress(dto.getAddress()))
                    .withEmail(dto.getEmail())
                    .withLicensePlate(licensePlateMapper.toLicensePlate(dto.getLicensePlateDTO()))
                    .withTelephoneNumber(dto.getTelephoneNumber())
                    .withMembershipLevel(Member.MembershipLevel.BRONZE)
                    .build();
        }
        return new Member.Builder()
                .withFirstName(dto.getFirstName())
                .withLastName(dto.getLastName())
                .withAddress(addressMapper.toAddress(dto.getAddress()))
                .withEmail(dto.getEmail())
                .withLicensePlate(licensePlateMapper.toLicensePlate(dto.getLicensePlateDTO()))
                .withTelephoneNumber(dto.getTelephoneNumber())
                .withMembershipLevel(dto.getMembershipLevel())
                .build();
    }

    public MemberDTO toDTO(Member member) {
        return new MemberDTO.Builder()
                .withFirstName(member.getFirstName())
                .withLastName(member.getLastName())
                .withId(member.getMemberId().toString())
                .withEmail(member.getEmail())
                .withlicensePlateNumber(member.getLicensePlate().getLicensePlateNumber())
                .withTelephoneNumber(member.getTelephoneNumber())
                .build();
    }
}
