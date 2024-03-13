FROM openjdk:17
WORKDIR /app

COPY --from=build /app/target/hello-1.0.jar ./app.jar
EXPOSE 8080
CMD ["java","-jar","hello-1.0.jar"]
