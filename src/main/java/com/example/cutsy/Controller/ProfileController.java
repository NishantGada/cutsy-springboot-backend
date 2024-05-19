package com.example.cutsy.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProfileController {
    @GetMapping("/profile-details")
    public Map<String, String> getProfileDetails() {
        System.out.println("Inside getProfileDetails");
        Map<String, String> response = new HashMap<>();
        response.put("firstName", "Nishant");
        response.put("lastName", "Gada");
        return response;
    }
}
