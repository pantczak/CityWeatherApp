# NoSQL_Databases ( CityWeatherApp project)

Project for NoSQL_Databases classes at TUL

## About project
To start app first execute command ```docker-compose up``` and wait for all Cassandra nodes to start and communicate with each other.

Then use command ```mvn spring-boot:run ``` to launch SpringBoot rest API.

A python script located in ```CityWeatherApp/Startup``` is responsible for filling the database with sample data via REST API.

## Used Technologies
* Spring Boot
* Java
* Cassandra
* Docker
* Apache Jmeter
