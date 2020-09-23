package com.example.WeatherWebApp.dto;

public class WeatherDto {

    private String cityName;
    private double temp;
    private double feelsLikeTemp;

    public WeatherDto(String cityName, double temp, double feelsLikeTemp) {
        this.cityName = cityName;
        this.temp = temp;
        this.feelsLikeTemp = feelsLikeTemp;
    }

    public WeatherDto() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeelsLikeTemp() {
        return feelsLikeTemp;
    }

    public void setFeelsLikeTemp(double feelsLikeTemp) {
        this.feelsLikeTemp = feelsLikeTemp;
    }
}
