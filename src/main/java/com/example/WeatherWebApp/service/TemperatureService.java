package com.example.WeatherWebApp.service;

import com.example.WeatherWebApp.utils.TempConverter;
import com.example.WeatherWebApp.model.Temperature;
import com.example.WeatherWebApp.repository.TemperatureRepo;
import com.example.WeatherWebApp.dto.WeatherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TemperatureService {

    private final TemperatureRepo temperatureRepo;

    @Autowired
    public TemperatureService(TemperatureRepo temperatureRepo) {
        this.temperatureRepo = temperatureRepo;
    }

    public Temperature saveTemperature(WeatherDto weatherDto){

        return temperatureRepo.save(new Temperature(weatherDto.getCityName(),
                TempConverter.convertToCelcius((weatherDto.getTemp())),
                TempConverter.convertToCelcius(weatherDto.getFeelsLikeTemp())));

    }

}
