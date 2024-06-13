FROM openjdk:17-jre-slim

LABEL authors="oppor"

ENV LANG=C.UTF-8 LC_ALL=C.UTF-8

VOLUME /tmp

ADD target/imgkic.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]
