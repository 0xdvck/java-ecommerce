FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} ecommerce.jar

ENTRYPOINT ["java", "-jar", "ecommerce.jar"]

EXPOSE 8080
