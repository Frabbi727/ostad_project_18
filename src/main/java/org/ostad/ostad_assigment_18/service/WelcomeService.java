package org.ostad.ostad_assigment_18.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Getter
@Service
public class WelcomeService {
    @Value("${app.message}")
    private String message;

    @Value("${app.api.url}")
    private String apiUrl;

}
