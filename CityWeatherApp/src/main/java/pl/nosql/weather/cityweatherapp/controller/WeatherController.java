package pl.nosql.weather.cityweatherapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.nosql.weather.cityweatherapp.model.WeatherData;
import pl.nosql.weather.cityweatherapp.service.Service;

import java.util.List;

@RestController
public class WeatherController {
    private final Service service;

    @Autowired
    public WeatherController(Service service) {
        this.service = service;
    }

    @GetMapping("/weather")
    List<WeatherData> getAll(){
        return service.findAll();
    }

    @GetMapping("weather/{id}/")
    WeatherData getById(@PathVariable("id") int id){
        return service.getById(id);
    }

    @GetMapping("weather/city/{findName}/")
    List<WeatherData> getByFindName(@PathVariable("findName") String findName){
        return service.getByFindName(findName);
    }

    @GetMapping("weather/city/{id}")
    List<WeatherData> getByCityId(@PathVariable("id") int id){
        return service.getByCityId(id);
    }



    //TODO implement REST
}
