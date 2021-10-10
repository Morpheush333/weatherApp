package com.matmed.weatherapp.controller;

import com.matmed.weatherapp.service.LiveWeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/weatherApp")
public class CurrentWeatherController {

    private final LiveWeatherService liveWeatherService;

    public CurrentWeatherController(LiveWeatherService liveWeatherService) {
        this.liveWeatherService = liveWeatherService;
    }

    @GetMapping()
    public String getHome(){
        return "index";
    }


    // htpp://weatherApp/current-weather
    @GetMapping("/current-weather")
    public String getCurrentWeather(
                @RequestParam String city,
                @RequestParam String country,
                @RequestParam String lang,
                Model model) {

        System.out.println(city);
        System.out.println(country);
        System.out.println(lang);
        model.addAttribute("currentWeather",
                liveWeatherService.getCurrentWeather(city, country, lang));

        return "current-weather";
    }

    @GetMapping("/select-weather")
    public String findWeather(){
        return "selection-of-weather";
    }
}
