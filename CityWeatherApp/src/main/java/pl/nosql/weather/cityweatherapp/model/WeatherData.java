package pl.nosql.weather.cityweatherapp.model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;

@Table
@Data
public class WeatherData {

    @PrimaryKey
    private int id;
//    @Column
//    private CityData city;
//    @Column
//    private Date time;
//    @Column
//    private MainData main;
//    @Column
//    private WindData wind;
//    @Column
//    private CloudData cloud;
//    @Column
//    private List<Phenomenon> weather;
    @Column
    private int cityId;
    @Column
    private String name;
    @Column
    private String findName;
    @Column
    private String country;
    @Column
    private double latitude;
    @Column
    private double longitude;
    @Column
    private int zoom;
    @Column
    private Date time;
    @Column
    private float temp;
    @Column
    private int pressure;
    @Column
    private int humidity;
    @Column
    private float tempMax;
    @Column
    private float tempMin;
    @Column
    private float windSpeed;
    @Column
    private int windDegree;
    @Column
    private int cloudsAll;
    @Column
    private int phenomenonId;
    @Column
    private String phenomenonType;
    @Column
    private String phenomenonDescription;
    @Column
    private String phenomenonIcon;

}
