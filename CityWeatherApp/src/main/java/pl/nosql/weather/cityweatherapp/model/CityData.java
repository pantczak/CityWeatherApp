package pl.nosql.weather.cityweatherapp.model;

import lombok.Data;

@Data
public class CityData {
    private int id;
    private String name;
    private String findName;
    private String country;
    private Coords coords;
    private int zoom;
}
