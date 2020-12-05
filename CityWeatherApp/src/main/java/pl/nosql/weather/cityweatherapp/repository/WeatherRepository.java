package pl.nosql.weather.cityweatherapp.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import pl.nosql.weather.cityweatherapp.model.Data;

public interface WeatherRepository extends CassandraRepository<Data, Long> {
}
