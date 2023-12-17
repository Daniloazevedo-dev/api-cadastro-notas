FROM maven:3.8.3-openjdk-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests=true

FROM openjdk:17-alpine
COPY --from=build /home/app/target/api-cadastro-notas.jar /usr/local/lib/api-cadastro-notas.jar

EXPOSE 8080

ENTRYPOINT ["java","-Dspring.profiles.active=prd",  "-jar", "/usr/local/lib/api-cadastro-notas.jar"]
