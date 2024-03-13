FROM openjdk:11
WORKDIR /hello
COPY pom.xml .
COPY src ./src
RUN mvn clean package
COPY --from=build /hello/target/hello-1.0.jar ./hello.jar
EXPOSE 8080
CMD ["java","-jar","hello-1.0.jar"]
