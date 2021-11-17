package com.switchfully.parkshark.service;

import com.switchfully.parkshark.dto.CreateParkingLotDTO;
import com.switchfully.parkshark.mapper.ParkingLotMapper;
import com.switchfully.parkshark.repository.ParkingLotRepository;
import com.switchfully.parkshark.entity.ParkingLot;
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
        CreateParkingLotDTO createParkingLotDTO = CreateParkingLotDTO.CreateParkingLotDTOBuilder.aCreateParkingLotDTO()
                .withName("TestName")
                //.withAddress(null) //might fail because of null
                .withMaxCapacity(50)
                .withHourlyPrice(1)
                //.withCategory(null)//might fail because of null
                .build();

        ParkingLot parkingLot = parkingLotMapper.mapCreateParkingLotDTOToParkingLot(createParkingLotDTO);

        parkingLotService.createParkingLot(createParkingLotDTO);

        Mockito.verify(parkingLotRepositoryMock).save(parkingLot);
    }

    @Test
    void givenCreateParkingLotDTO_WhenMapToParkingLot_thenExpectCorrectParkingLotObject() {
        //given
        CreateParkingLotDTO createParkingLotDTO = CreateParkingLotDTO.CreateParkingLotDTOBuilder.aCreateParkingLotDTO()
                .withName("TestName")
                .withAddress(null) //might fail because of null
                .withMaxCapacity(50)
                .withHourlyPrice(1)
                .withCategory(null)//might fail because of null
                .build();

        //when
        ParkingLot parkingLot = parkingLotMapper.mapCreateParkingLotDTOToParkingLot(createParkingLotDTO);
        //ParkingLot expectedParkingLot = new ParkingLot(


    }

    @Test
    void whenCreatingParkingLot_ThrowUnauthorizedMemberExceptionIfMemberIsNotManager() {

    }

    @Test
    void whenCreatingParkingLot_returnParkingLotIfMemberIsManager() {

    }

}