package com.petrarca.springboot.service.impl;

import com.petrarca.springboot.service.interfaces.SystemProfile;

public class IftProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is IFT";
    }
}