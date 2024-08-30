package com.ocs.azureDemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/home")
public class OllehController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello, Azure with ktds OCS!";
    }

    @GetMapping("/good")
    public Map<String, String> good() {
        Map<String, String> response = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        response.put("message", "Hello, Azure with ktds OCS!");
        response.put("timestamp", now.format(formatter));
        
        return response;
    }
}


