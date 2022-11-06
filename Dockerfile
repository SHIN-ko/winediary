FROM openjdk:11
#ARG JAR_FILE=build/libs/wiendiary-0.0.1-SNAPSHOT.jar
#ADD ${JAR_FILE} wada.jar
WORKDIR /usr/src/app
COPY ./build/libs/winediary-0.0.1-SNAPSHOT.jar /build/libs/winediary-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "/build/libs/winediary-0.0.1-SNAPSHOT.jar"]