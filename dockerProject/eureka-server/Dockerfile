FROM openjdk:8u181-jdk-alpine
ARG workdir=/app
VOLUME ${workdir}
WORKDIR ${workdir}
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
EXPOSE 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]