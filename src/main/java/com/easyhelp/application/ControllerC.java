package com.easyhelp.application;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
public class ControllerC {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin
    @PostMapping("/api/hello-world")
    @ResponseBody
    public Greeting sayHello(@RequestBody String body, @RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @ModelAttribute
    public void setVaryResponseHeaders(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Credentials", "true");
    }
}