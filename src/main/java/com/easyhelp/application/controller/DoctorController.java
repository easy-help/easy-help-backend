package com.easyhelp.application.controller;

import com.easyhelp.application.model.Doctor;
import com.easyhelp.application.server.ServerResponse;
import com.easyhelp.application.service.DoctorServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DoctorController implements DoctorControllerInterface{

    @Autowired
    DoctorServiceInterface doctorServiceInterface;

    private ServerResponse<Doctor> getAllDoctors() {
        ServerResponse<Doctor> serverResponse = new ServerResponse<>();
        serverResponse.setId("Doctors");
        serverResponse.setAct("getAll");
        serverResponse.setModel(doctorServiceInterface.getAllDoctors());
        return serverResponse;
    }

    @Override
    public ServerResponse<Doctor> handleRequest(String act) {
        if(act.equals("getAll")){
            return getAllDoctors();
        }
        return new ServerResponse<>();
    }
}
