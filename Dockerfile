FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/big-basket-server-1.0.jar app.jar

EXPOSE 5000

ENTRYPOINT ["java", "-jar", "app.jar"]