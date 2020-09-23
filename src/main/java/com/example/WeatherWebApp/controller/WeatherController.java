package com.example.WeatherWebApp.controller;

import com.example.WeatherWebApp.service.WeatherService;
import com.example.WeatherWebApp.model.Temperature;
import com.example.WeatherWebApp.repository.TemperatureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class WeatherController {

    private final WeatherService weatherService;
    private final TemperatureRepo temperatureRepo;

    @Autowired
    public WeatherController(WeatherService weatherService, TemperatureRepo temperatureRepo){
        this.weatherService = weatherService;
        this.temperatureRepo = temperatureRepo;
    }


    @GetMapping("/weather/{city}")
    public String saveWeatherInfo(@PathVariable String city) {
       weatherService.getWeatherInfo(city);
        return "Data saved to DB";
    }

    @GetMapping("weathers")
            public List<Temperature> show(){
       return temperatureRepo.findAll();
    }

}
