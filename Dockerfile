FROM openjdk:17

WORKDIR /app

COPY ./target/course-java.jar /app

EXPOSE 8081

CMD ["java","-jar","course-java.jar"]