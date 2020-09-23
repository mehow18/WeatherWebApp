package com.example.WeatherWebApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class WeatherDto {

    private String cityName;
    private double temp;
    private double feelsLikeTemp;
}
