package pl.nosql.weather.cityweatherapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.nosql.weather.cityweatherapp.model.Data;
import pl.nosql.weather.cityweatherapp.repository.WeatherRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class WeatherController {

    private final WeatherRepository weatherRepository;

    public WeatherController(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }


    @GetMapping("/weather")
    public ResponseEntity<List<Data>> getAllWeatherData() {
        try {
            List<Data> dataList = new ArrayList<>(weatherRepository.findAll());
            if (dataList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(dataList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/weather/{id}")
    public ResponseEntity<Data> getById(@PathVariable("id") Long id) {
        Optional<Data> weatherData = weatherRepository.findById(id);
        if (weatherData.isPresent()) {
            return new ResponseEntity<>(weatherData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/weather")
    public ResponseEntity<Data> createWeatherData(@RequestBody Data weatherData) {
        try {
            Data _Data = weatherRepository.save(new Data(weatherData.getId(), weatherData.getCity(),
                    weatherData.getTime(),weatherData.getMain(),weatherData.getWind(), weatherData.getClouds(),
                    weatherData.getWeather()));
            return new ResponseEntity<>(_Data, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/weather/{id}")
    public ResponseEntity<Data> updateWeatherData(@PathVariable("id") Long id, @RequestBody Data weatherData) {
        Optional<Data> foundData = weatherRepository.findById(id);

        if (foundData.isPresent()){
            Data _Data = foundData.get();
            _Data.setCity(weatherData.getCity());
            _Data.setTime(weatherData.getTime());
            _Data.setMain(weatherData.getMain());
            _Data.setClouds(weatherData.getClouds());
            _Data.setWind(weatherData.getWind());
            _Data.setWeather(weatherData.getWeather());

            return new ResponseEntity<>(weatherRepository.save(_Data),HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/weather/{id}")
    public ResponseEntity<HttpStatus> deleteData(@PathVariable("id") Long id) {
        try {
            weatherRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
