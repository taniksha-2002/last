FROM openjdk:17
ADD target/hello-1.0.jar hello-1.0.jar
ENTRYPOINT ["java", "-jar", "hello-1.0.jar"]