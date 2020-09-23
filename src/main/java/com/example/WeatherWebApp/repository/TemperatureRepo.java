package com.example.WeatherWebApp.repository;

import com.example.WeatherWebApp.model.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemperatureRepo extends JpaRepository<Temperature,Long> {
    List<Temperature> findAll();

}
