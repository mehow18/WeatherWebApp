package com.example.WeatherWebApp.Service;

import com.example.WeatherWebApp.Service.TemperatureService;
import com.example.WeatherWebApp.dto.WeatherDto;
import com.example.WeatherWebApp.model.WeatherInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    TemperatureService temperatureService;

    @Autowired
    public WeatherService(TemperatureService temperatureService){
        this.temperatureService = temperatureService;
    }
    public void getWeatherInfo(String city){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WeatherInformation> entity = restTemplate.getForEntity(
                "http://api.openweathermap.org/data/2.5/weather?q="+ city +"&APPID=ddc909084c9704373bc30a329e8d6e18",
                WeatherInformation.class);

        WeatherDto weatherDto = new WeatherDto(entity.getBody().getName(),
                entity.getBody().getMain().getTemp(),
                entity.getBody().getMain().getFeelsLike());

        temperatureService.saveTemperature(weatherDto);

    }

}
