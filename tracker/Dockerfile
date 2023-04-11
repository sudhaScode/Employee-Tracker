# FROM maven AS build
# WORKDIR /app
# COPY target/tracker-0.0.1-SNAPSHOT.jar demo.jar
# # RUN mvn spring-boot:run
# EXPOSE  8080
# CMD ["mvn", "spring-boot:run"]

# FROM openjdk:17-jdk-alpine3.14
# WORKDIR /app
# COPY target/tracker-0.0.1-SNAPSHOT.jar demo.jar
# EXPOSE 8080
# #CMD ["java", "-jar", "demo.jar"]

# syntax=docker/dockerfile:1

FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve
COPY src ./src
EXPOSE 8080
CMD ["./mvnw", "spring-boot:run"]