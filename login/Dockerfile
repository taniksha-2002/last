FROM openjdk:17
LABEL authors="MGSUser"
VOLUME /tmp
COPY target/*.jar SpringBootRegistrationLogin-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/SpringBootRegistrationLogin-1.0.jar"]