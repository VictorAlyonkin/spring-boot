package com.petrarca.springboot.controller;

import com.petrarca.springboot.service.interfaces.SystemProfile;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class ProfileController {
    private SystemProfile profile;

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}
