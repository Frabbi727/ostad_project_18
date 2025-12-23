package org.ostad.ostad_assigment_18.controller;

import org.ostad.ostad_assigment_18.service.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StatusController {
    private final WelcomeService welcomeService;

    public StatusController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }


    @GetMapping("/api/status")
    public Map<String, String> status() {
        return Map.of(
                "message", welcomeService.getMessage(),
                "apiUrl", welcomeService.getApiUrl()
        );
    }
}
