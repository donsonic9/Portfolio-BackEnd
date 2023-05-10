
FROM amazoncorretto:17-alpine-jdk AS build

COPY BackendDS9/target/BackEndDS9-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
