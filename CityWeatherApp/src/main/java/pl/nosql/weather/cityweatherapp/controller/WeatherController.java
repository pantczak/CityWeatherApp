package pl.nosql.weather.cityweatherapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.nosql.weather.cityweatherapp.model.WeatherData;
import pl.nosql.weather.cityweatherapp.service.Service;

import java.util.Date;
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

    @GetMapping("weather/city/{id}&{dateStart}&{DateEnd/")
    List<WeatherData> getByFindNameAndTimeBetween(@PathVariable("id") int id, @PathVariable("dateStart") Date dateStart,@PathVariable("dateStart") Date dateEnd){
        return service.getByCityIdAndTimeBetween(id,dateStart,dateEnd);
    }

    @PostMapping(value = "/weather/add", consumes = "application/json",produces = "application/json")
    void saveData(@RequestBody WeatherData weatherData){
        service.saveData(weatherData);
    }

    @DeleteMapping("/weather/{id}")
    void deleteData(@PathVariable("id")int id){
        this.service.deleteById(id);
    }

    @PutMapping(path = "weather/update/{id}", consumes = "application/json", produces = "application/json")
    ResponseEntity<WeatherData> updateData(@PathVariable("id") int id,@RequestBody WeatherData weatherData){
        return null;
        //TODO FILL
    }



    //TODO implement REST
}
