package com.matmed.weatherapp.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class CurrentWeather implements Serializable {

    private String mainWeather;
    private String description;
    private BigDecimal temperature;
    private BigDecimal feelsLike;
    private BigDecimal windSpeed;
    private String city;

    public CurrentWeather() {
    }

    public CurrentWeather(String mainWeather, String description, BigDecimal temperature, BigDecimal feelsLike, BigDecimal windSpeed, String city) {
        this.mainWeather = mainWeather;
        this.description = description;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.windSpeed = windSpeed;
        this.city = city;
    }

    public String getMainWeather() {
        return mainWeather;
    }

    public void setMainWeather(String mainWeather) {
        this.mainWeather = mainWeather;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public BigDecimal getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(BigDecimal feelsLike) {
        this.feelsLike = feelsLike;
    }

    public BigDecimal getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(BigDecimal windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CurrentWeather)) return false;

        CurrentWeather that = (CurrentWeather) o;

        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (temperature != null ? !temperature.equals(that.temperature) : that.temperature != null) return false;
        if (feelsLike != null ? !feelsLike.equals(that.feelsLike) : that.feelsLike != null) return false;
        return windSpeed != null ? windSpeed.equals(that.windSpeed) : that.windSpeed == null;
    }

    @Override
    public int hashCode() {
        int result = description != null ? description.hashCode() : 0;
        result = 31 * result + (temperature != null ? temperature.hashCode() : 0);
        result = 31 * result + (feelsLike != null ? feelsLike.hashCode() : 0);
        result = 31 * result + (windSpeed != null ? windSpeed.hashCode() : 0);
        return result;
    }
}
