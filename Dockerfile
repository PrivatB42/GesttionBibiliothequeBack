FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
COPY --from=build /target/GesttionBibiliothequeBack-0.0.1-SNAPSHOT.jar GesttionBibiliothequeBack.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","demo.jar"]