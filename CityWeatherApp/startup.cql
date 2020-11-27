CREATE KEYSPACE IF NOT EXISTS WeatherSpace
    WITH REPLICATION ={'class':'SimpleStrategy','replication_factor':3};

CREATE TABLE IF NOT EXISTS WeatherSpace.weatherdata
(
    id                    int primary key,
    cityId                int,
    name                  text,
    findName              text,
    country               text,
    latitude              float,
    longitude             float,
    time                  int,
    temp                  float,
    pressure              int,
    humidity              int,
    tempMax               float,
    tempMin               float,
    windSpeed             float,
    windDegree            float,
    cloudsAll             int,
    phenomenonId          int,
    phenomenonType        text,
    phenomenonDescription text,
    phenomenonIcon        text,
);

INSERT INTO WeatherSpace.weatherdata(id, cityId, name, findName, country, latitude, longitude, time, temp, pressure,
                                   humidity, tempMax, tempMin, windSpeed, windDegree, cloudsAll, phenomenonId,
                                      phenomenonType, phenomenonDescription, phenomenonIcon)
VALUES (1, 2331, 'Warasw', 'WARSAW', 'PL', 22.2, 12, 2, 1589108400, 1421, 60, 33.3, 22.3, 33.3, 234, 10, 1, 'MW', 'Cos',
        '4A8');