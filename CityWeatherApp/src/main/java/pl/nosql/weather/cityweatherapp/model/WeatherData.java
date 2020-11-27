package pl.nosql.weather.cityweatherapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;

@Table
public class WeatherData {

    @PrimaryKey
    private Integer id;
    private int cityId;
    private String name;
    private String findName;
    private String country;
    private double latitude;
    private double longitude;
    private Date time;
    private float temp;
    private int pressure;
    private int humidity;
    private float tempMax;
    private float tempMin;
    private float windSpeed;
    private int windDegree;
    private int cloudsAll;
    private int phenomenonId;
    private String phenomenonType;
    private String phenomenonDescription;
    private String phenomenonIcon;

    public WeatherData(Integer id, int cityId, String name, String findName, String country,
                       double latitude, double longitude, Date time, float temp, int pressure,
                       int humidity, float tempMax, float tempMin, float windSpeed, int windDegree,
                       int cloudsAll, int phenomenonId, String phenomenonType, String phenomenonDescription,
                       String phenomenonIcon) {
        this.id = id;
        this.cityId = cityId;
        this.name = name;
        this.findName = findName;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.time = time;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.windSpeed = windSpeed;
        this.windDegree = windDegree;
        this.cloudsAll = cloudsAll;
        this.phenomenonId = phenomenonId;
        this.phenomenonType = phenomenonType;
        this.phenomenonDescription = phenomenonDescription;
        this.phenomenonIcon = phenomenonIcon;
    }

    public Integer getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFindName() {
        return findName;
    }

    public void setFindName(String findName) {
        this.findName = findName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    public int getCloudsAll() {
        return cloudsAll;
    }

    public void setCloudsAll(int cloudsAll) {
        this.cloudsAll = cloudsAll;
    }

    public int getPhenomenonId() {
        return phenomenonId;
    }

    public void setPhenomenonId(int phenomenonId) {
        this.phenomenonId = phenomenonId;
    }

    public String getPhenomenonType() {
        return phenomenonType;
    }

    public void setPhenomenonType(String phenomenonType) {
        this.phenomenonType = phenomenonType;
    }

    public String getPhenomenonDescription() {
        return phenomenonDescription;
    }

    public void setPhenomenonDescription(String phenomenonDescription) {
        this.phenomenonDescription = phenomenonDescription;
    }

    public String getPhenomenonIcon() {
        return phenomenonIcon;
    }

    public void setPhenomenonIcon(String phenomenonIcon) {
        this.phenomenonIcon = phenomenonIcon;
    }

}
