package com.switchfully.parkshark.service;

import com.switchfully.parkshark.dto.CreateParkingLotDTO;
import com.switchfully.parkshark.mapper.ParkingLotMapper;
import com.switchfully.parkshark.repository.ParkingLotRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotServiceTest {

    private ParkingLotRepository parkingLotRepositoryMock;
    private ParkingLotService parkingLotService;
    private ParkingLotMapper parkingLotMapper;

    @BeforeEach
    void setUp() {
        parkingLotRepositoryMock = Mockito.mock(ParkingLotRepository.class);
        parkingLotService = new ParkingLotService(parkingLotRepositoryMock, parkingLotMapper);
    }

    @Test
    void whenCreateParkingLot_thenParkingLotRepositorySaveMethodShouldBeCalled() {
        //parkingLotService.createParkingLot()
    }

    @Test
    void whenCreatingParkingLot_ThrowUnauthorizedMemberExceptionIfMemberIsNotManager(){

    }

    @Test
    void whenCreatingParkingLot_returnParkingLotIfMemberIsManager(){

    }

}