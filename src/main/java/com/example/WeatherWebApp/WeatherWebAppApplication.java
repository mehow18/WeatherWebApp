package com.example.WeatherWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherWebAppApplication.class, args);

	}



}
