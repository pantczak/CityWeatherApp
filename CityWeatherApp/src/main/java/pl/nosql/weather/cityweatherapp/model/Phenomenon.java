package pl.nosql.weather.cityweatherapp.model;

import lombok.Data;

@Data
public class Phenomenon {
    private int id;
    private String type;
    private String description;
    private String icon;
}
