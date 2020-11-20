package pl.nosql.weather.cityweatherapp.model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.List;

@Table
@Data
public class WeatherData {
    @PrimaryKey
    private int id;
    private CityData city;
    private Date time;
    private MainData main;
    private WindData wind;
    private CloudData cloud;
    private List<WeatherData> weather;

}
