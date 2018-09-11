package com.easyhelp.application.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.easyhelp.application.model.Doctor;
import com.easyhelp.application.service.DoctorServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DoctorController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private DoctorServiceInterface doctorServiceInterface;

    @CrossOrigin
    @PostMapping("/api/hello-world")
    @ResponseBody
    public Doctor sayHello(@RequestBody(required = false) String body, @RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new Doctor("Stefan", "Georgescu");
    }

    @CrossOrigin
    @GetMapping("/api/doctors")
    @ResponseBody
    public List<Doctor> getAllDoctors() {
        return doctorServiceInterface.getAllDoctors();
    }

}