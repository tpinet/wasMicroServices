FROM openJDK:latest
WORKDIR /opt
COPY ./build/libs/wasMicroServices-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "/opt/wasMicroServices-0.0.1-SNAPSHOT.jar" ]