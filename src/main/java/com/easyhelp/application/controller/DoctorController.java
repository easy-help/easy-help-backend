package com.easyhelp.application.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.easyhelp.application.model.Doctor;
import com.easyhelp.application.service.DoctorServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorController {

    @Autowired
    private DoctorServiceInterface doctorServiceInterface;


    @CrossOrigin
    @GetMapping("/api/doctors")
    public @ResponseBody List<Doctor> getAllDoctors() {
        return doctorServiceInterface.getAllDoctors();
    }

    @CrossOrigin
    @GetMapping("/api/doctor")
    @ResponseBody
    public Doctor getAllDoctor() {
        return doctorServiceInterface.getAllDoctors().get(0);
    }

}