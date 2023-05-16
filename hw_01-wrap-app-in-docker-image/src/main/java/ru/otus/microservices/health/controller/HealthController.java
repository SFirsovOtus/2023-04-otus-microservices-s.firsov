package ru.otus.microservices.health.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.microservices.health.dto.HealthInfoDto;
import ru.otus.microservices.health.enums.HealthStatus;

@RestController
public class HealthController {

    private static final String URI_HEALTH = "/health/";


    @GetMapping(URI_HEALTH)
    public HealthInfoDto getHealthInfo() {
        return new HealthInfoDto(HealthStatus.OK);
    }

}
