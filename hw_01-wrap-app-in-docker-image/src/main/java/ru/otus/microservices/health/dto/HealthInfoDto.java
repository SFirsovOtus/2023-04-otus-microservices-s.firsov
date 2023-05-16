package ru.otus.microservices.health.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.otus.microservices.health.enums.HealthStatus;

public class HealthInfoDto {

    @JsonProperty("status")
    private HealthStatus status;


    public HealthInfoDto(HealthStatus status) {
        this.status = status;
    }

}
