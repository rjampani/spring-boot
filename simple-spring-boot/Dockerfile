FROM openjdk:8-jre-alpine
ADD target/simple-spring-boot.jar /simple-spring-boot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/simple-spring-boot.jar"]