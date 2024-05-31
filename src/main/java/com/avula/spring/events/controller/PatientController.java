package com.avula.spring.events.controller;

import com.avula.spring.events.dto.DisChargePatientRequest;
import com.avula.spring.events.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/discharge")
    public String disChargePatient(@RequestBody DisChargePatientRequest request){

    return patientService.disChargePatient(request);


    }
}
