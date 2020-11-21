package pl.nosql.weather.cityweatherapp.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import pl.nosql.weather.cityweatherapp.model.WeatherData;

import java.util.Date;
import java.util.List;

public interface WeatherRepository extends CassandraRepository<WeatherData, Integer> {

    WeatherData getById(int id);

    void deleteById(int id);

    List<WeatherData> getByFindName(String findName);

    List<WeatherData> getByCityId(int cityId);

    List<WeatherData> getByCityIdAndTimeBetween(int cityId, Date dateStart, Date dateEnd);
}
