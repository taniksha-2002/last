FROM ubuntu:latest
LABEL authors="MGSUser"
VOLUME /tmp
COPY target/test-classes/*.jar hello-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/hello-1.0.jar"]
