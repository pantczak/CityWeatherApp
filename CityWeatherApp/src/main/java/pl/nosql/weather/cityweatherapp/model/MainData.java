package pl.nosql.weather.cityweatherapp.model;

import lombok.Data;

@Data
public class MainData {
    private float temp;
    private int pressure;
    private int humidity;
    private float tempMax;
    private float tempMin;
}
