package pl.nosql.weather.cityweatherapp.model;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType
public class Wind {
    private float speed;
    private int deg;

    public Wind(float speed, int deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }
}
