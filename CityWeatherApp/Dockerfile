FROM openjdk:11-alpine
ARG JAR_FILE
ADD target/${JAR_FILE} CityWeatherApp-1.jar
ENTRYPOINT ["java","-jar","/CityWeatherApp-1.jar"]