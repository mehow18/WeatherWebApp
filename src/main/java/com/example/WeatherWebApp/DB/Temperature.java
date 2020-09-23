package com.example.WeatherWebApp.DB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@Table(name = "temperature")
public class Temperature {

    public Temperature() {
    }

    public Temperature(String cityName, double temp, double feelsLikeTemp) {
        this.cityName = cityName;
        this.temp = temp;
        this.feelsLikeTemp = feelsLikeTemp;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String cityName;

    private double temp;

    private double feelsLikeTemp;

    @CreationTimestamp
    private Instant createTime;

}
