
FROM openjdk:17
LABEL authors="MGSUser"
VOLUME /tmp
COPY target/database-1.0.jar database-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/database-1.0.jar"]