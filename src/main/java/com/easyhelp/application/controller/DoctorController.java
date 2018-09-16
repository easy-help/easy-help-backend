package com.easyhelp.application.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.easyhelp.application.model.Doctor;
import com.easyhelp.application.server.ServerResponse;
import com.easyhelp.application.service.DoctorServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorController {

    @Autowired
    private DoctorServiceInterface doctorServiceInterface;


    @CrossOrigin
    @GetMapping("/api/doctors")
    public @ResponseBody ServerResponse<Doctor> getAllDoctors() {
        ServerResponse<Doctor> doctorServerResponse = new ServerResponse<>();
        doctorServerResponse.setId("Doctors");
        doctorServerResponse.setAct("GetAll");
        doctorServerResponse.setModel(doctorServiceInterface.getAllDoctors());
        return doctorServerResponse;
    }

    @CrossOrigin
    @GetMapping("/api/doctor")
    @ResponseBody
    public Doctor getAllDoctor() {
        return doctorServiceInterface.getAllDoctors().get(0);
    }

}