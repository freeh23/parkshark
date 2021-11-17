package com.switchfully.parkshark.service;

import com.switchfully.parkshark.dto.CreateMemberDTO;
import com.switchfully.parkshark.dto.MemberDTO;
import com.switchfully.parkshark.mapper.MemberMapper;
import com.switchfully.parkshark.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberMapper mapper;
    private final MemberRepository repository;

    @Autowired
    public MemberService(MemberMapper mapper, MemberRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }


    public MemberDTO createMember(CreateMemberDTO dto) {

        var newMember = mapper.toMember(dto);
    }


    public  List<MemberDTO> getAllMembers() {
        return null;
    }


    public MemberDTO getSpecificMemberById(String id) {
        return null;
    }
}
