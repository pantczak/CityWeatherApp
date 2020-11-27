package pl.nosql.weather.cityweatherapp.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import pl.nosql.weather.cityweatherapp.model.Data;

import java.util.List;


public interface WeatherRepository extends CassandraRepository<Data, Integer> {

    List<Data> findByCityFindname (String findName);
}
