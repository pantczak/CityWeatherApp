package pl.nosql.weather.cityweatherapp.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import pl.nosql.weather.cityweatherapp.model.WeatherData;

import java.util.List;


public interface WeatherRepository extends CassandraRepository<WeatherData, Integer> {

    List<WeatherData> findByFindName(String findName);
}
