FROM openjdk:17
WORKDIR /app
COPY ./target/spring-deploy.jar /app
EXPOSE 8080
CMD ["java" , "-jar" , "spring-deploy.jar"]