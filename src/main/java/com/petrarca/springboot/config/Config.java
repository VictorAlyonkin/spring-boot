package com.petrarca.springboot.config;

import com.petrarca.springboot.service.impl.DevProfile;
import com.petrarca.springboot.service.impl.IftProfile;
import com.petrarca.springboot.service.impl.ProductionProfile;
import com.petrarca.springboot.service.impl.PsiProfile;
import com.petrarca.springboot.service.interfaces.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "dev")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "ift")
    public SystemProfile iftProfile() {
        return new IftProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "psi")
    public SystemProfile psiProfile() {
        return new PsiProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "prod")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}


