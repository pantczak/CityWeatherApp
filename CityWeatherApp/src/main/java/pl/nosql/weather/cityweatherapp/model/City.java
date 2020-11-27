package pl.nosql.weather.cityweatherapp.model;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType
public class City {
    private int id;
    private String name;
    private String findname;
    private String country;
    private Coordinates coord;

    public City(int id, String name, String findname, String country, Coordinates coord) {
        this.id = id;
        this.name = name;
        this.findname = findname;
        this.country = country;
        this.coord = coord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFindname() {
        return findname;
    }

    public void setFindname(String findname) {
        this.findname = findname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Coordinates getCoord() {
        return coord;
    }

    public void setCoord(Coordinates coord) {
        this.coord = coord;
    }
}
