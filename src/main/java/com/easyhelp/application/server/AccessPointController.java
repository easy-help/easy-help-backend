package com.easyhelp.application.server;


import com.easyhelp.application.controller.DoctorControllerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin

public class AccessPointController {

    @Autowired
    DoctorControllerInterface doctorControllerInterface;

    @PostMapping(value = "/api", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ServerResponse handleRequest(@RequestBody ServerRequest request) {
        return passRequestToController(request);
    }


    private ServerResponse passRequestToController(ServerRequest request) {
        if (request.getId().equals("doctor")) {
            return doctorControllerInterface.handleRequest(request.getAct());
        }
        return new ServerResponse<>();
    }
}
