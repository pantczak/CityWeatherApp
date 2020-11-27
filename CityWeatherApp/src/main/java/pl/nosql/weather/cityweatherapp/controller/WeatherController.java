package pl.nosql.weather.cityweatherapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.nosql.weather.cityweatherapp.model.WeatherData;
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
    public ResponseEntity<List<WeatherData>> getAllWeatherData(@RequestParam(required = false) String findName) {
        try {
            List<WeatherData> dataList = new ArrayList<>();
            if (findName == null)
                dataList.addAll(weatherRepository.findAll());
            else
                dataList.addAll(weatherRepository.findByFindName(findName.toUpperCase()));
            if (dataList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(dataList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("weather/{id}")
    public ResponseEntity<WeatherData> getById(@PathVariable("id") Integer id) {
        Optional<WeatherData> weatherData = weatherRepository.findById(id);
        if (weatherData.isPresent()) {
            return new ResponseEntity<>(weatherData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("weather")
    public ResponseEntity<WeatherData> createWeatherData(@RequestBody WeatherData weatherData) {
        try {
            WeatherData _Data = weatherRepository.save(new WeatherData(weatherData.getId(), weatherData.getCityId(),
                    weatherData.getName(), weatherData.getFindName(), weatherData.getCountry(),
                    weatherData.getLatitude(), weatherData.getLongitude(), weatherData.getTime(),
                    weatherData.getTemp(), weatherData.getPressure(), weatherData.getHumidity(),
                    weatherData.getTempMax(), weatherData.getTempMin(), weatherData.getWindSpeed(),
                    weatherData.getWindDegree(), weatherData.getCloudsAll(), weatherData.getPhenomenonId(),
                    weatherData.getPhenomenonType(), weatherData.getPhenomenonDescription(),
                    weatherData.getPhenomenonIcon()));
            return new ResponseEntity<>(_Data, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/weather/{id}")
    public ResponseEntity<WeatherData> updateWeatherData(@PathVariable("id") Integer id, @RequestBody WeatherData weatherData) {
        Optional<WeatherData> foundData = weatherRepository.findById(id);

        if (foundData.isPresent()){
            WeatherData _Data = foundData.get();
            _Data.setCityId(weatherData.getCityId());
            _Data.setName(weatherData.getName());
            _Data.setFindName(weatherData.getFindName());
            _Data.setCountry(weatherData.getCountry());
            _Data.setLatitude(weatherData.getLatitude());
            _Data.setLongitude(weatherData.getLongitude());
            _Data.setTime(weatherData.getTime());
            _Data.setTemp(weatherData.getTemp());
            _Data.setPressure(weatherData.getPressure());
            _Data.setHumidity(weatherData.getHumidity());
            _Data.setTempMax(weatherData.getTempMax());
            _Data.setTempMin(weatherData.getTempMin());
            _Data.setWindSpeed(weatherData.getWindSpeed());
            _Data.setWindDegree(weatherData.getWindDegree());
            _Data.setCloudsAll(weatherData.getCloudsAll());
            _Data.setPhenomenonId(weatherData.getPhenomenonId());
            _Data.setPhenomenonType(weatherData.getPhenomenonType());
            _Data.setPhenomenonDescription(weatherData.getPhenomenonDescription());
            _Data.setPhenomenonIcon(weatherData.getPhenomenonIcon());

            return new ResponseEntity<>(weatherRepository.save(_Data),HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/weather/{id}")
    public ResponseEntity<HttpStatus> deleteData(@PathVariable("id") Integer id) {
        try {
            weatherRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
