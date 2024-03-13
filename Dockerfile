FROM openjdk:11
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package
COPY --from=build /app/target/hello-1.0.jar ./app.jar
EXPOSE 8080
CMD ["java","-jar","hello-1.0.jar"]
