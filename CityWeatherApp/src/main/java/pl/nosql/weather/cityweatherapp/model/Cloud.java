package pl.nosql.weather.cityweatherapp.model;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType
public class Cloud {
    private int all;

    public Cloud(int all) {
        this.all = all;
    }

    public Cloud() {
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }
}
