package com.easyhelp.application.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.easyhelp.application.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerC {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin
    @PostMapping("/api/hello-world")
    @ResponseBody
    public Doctor sayHello(@RequestBody(required = false) String body, @RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new Doctor("Stefan", "Georgescu");
    }
}