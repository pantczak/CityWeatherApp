package pl.nosql.weather.cityweatherapp.model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table
class CityData {
    private int cityId;
    private String name;
    private String findName;
    private String country;
    private Coords coords;
    private int zoom;
}
