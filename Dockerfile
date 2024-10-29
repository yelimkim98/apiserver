FROM amazoncorretto:17
LABEL authors="kiel0"
COPY ./build/libs/*jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]