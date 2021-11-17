package com.switchfully.parkshark.repository;

import com.switchfully.parkshark.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MemberRepository extends JpaRepository<Member,Integer> {

    Member findAllByMemberId();

}
