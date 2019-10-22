FROM openjdk:11-jdk-slim

ENV LANG C.UTF-8

ADD build/libs/heroes.jar heroes.jar

ENTRYPOINT ["java", "-jar", "heroes.jar"]

EXPOSE 8082