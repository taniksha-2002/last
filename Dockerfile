FROM openjdk:17
ADD target/hello-1.0.jar hello-1.0.jar
ENTRYPOINT ["java", "-jar", "hello-1.0.jar"]
EXPOSE 8080

FROM mysql:latest
ENV MYSQL_ROOT_PASSWORD=Mgs@123456
ENV MYSQL_DATABASE = hello_sql
ENV MYSQL_ROOT_PASSWORD=Mgs@123456
EXPOSE 3306