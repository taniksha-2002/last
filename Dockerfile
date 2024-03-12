FROM openjdk:17
LABEL authors="MGSUser"
VOLUME /tmp
COPY .mvn/wrapper/*.jar maven-wrapper.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/maven-wrapper.jar"]