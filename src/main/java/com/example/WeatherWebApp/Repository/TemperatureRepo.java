package com.example.WeatherWebApp.Repository;

import com.example.WeatherWebApp.DB.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemperatureRepo extends JpaRepository<Temperature,Long> {
    List<Temperature> findAll();

}
