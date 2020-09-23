package com.example.WeatherWebApp.Service;

import com.example.WeatherWebApp.TempConverter;
import com.example.WeatherWebApp.DB.Temperature;
import com.example.WeatherWebApp.Repository.TemperatureRepo;
import com.example.WeatherWebApp.dto.WeatherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TemperatureService {

    TemperatureRepo temperatureRepo;

    @Autowired
    public TemperatureService(TemperatureRepo temperatureRepo) {
        this.temperatureRepo = temperatureRepo;
    }

    public Temperature saveTemperature(WeatherDto weatherDto){

        TempConverter tc = new TempConverter();
        return temperatureRepo.save(new Temperature(weatherDto.getCityName(),
                tc.convertToCelcius((weatherDto.getTemp())),
                tc.convertToCelcius(weatherDto.getFeelsLikeTemp())));

    }

}
