package com.switchfully.parkshark.controller;

import com.switchfully.parkshark.dto.CreateDivisionDTO;
import com.switchfully.parkshark.dto.DivisionDTO;
import com.switchfully.parkshark.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "divisions")
public class DivisionController {

    private final DivisionService divisionService;

    @Autowired
    public DivisionController(DivisionService divisionService) {
        this.divisionService = divisionService;
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    // @SecurityGuard(SecurityGuard.ApiUserRole.ADMIN)
    public List<DivisionDTO> getAllDivisions() {
        return divisionService.getAllDivisions();
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    // @SecurityGuard(SecurityGuard.ApiUserRole.ADMIN)
    public DivisionDTO getDivision(@PathVariable int id) {
        return divisionService.getDivision(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    // @SecurityGuard(SecurityGuard.ApiUserRole.ADMIN)
    public DivisionDTO createDivision(@RequestBody CreateDivisionDTO createDivisionDTO) {
        return divisionService.save(createDivisionDTO);
    }
}
