FROM eclipse-temurin:17-jdk-alpine
WORKDIR /opt/app
ARG JAR_FILE=build/libs/listener1-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} listener1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/opt/app/listener1-0.0.1-SNAPSHOT.jar"]

