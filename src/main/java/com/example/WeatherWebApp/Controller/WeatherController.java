package com.example.WeatherWebApp.Controller;

import com.example.WeatherWebApp.Service.WeatherService;
import com.example.WeatherWebApp.DB.Temperature;
import com.example.WeatherWebApp.Repository.TemperatureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class WeatherController {

    WeatherService weatherService;
    TemperatureRepo temperatureRepo;

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

    @GetMapping("/show/all")
            public List<Temperature> show(){
       return temperatureRepo.findAll();
    }

}
