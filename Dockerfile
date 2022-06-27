FROM openjdk:8-alpine
EXPOSE 8080
ADD target/demo-crud-proj.jar demo-crud-proj.jar
ENTRYPOINT ["java","-jar","demo-crud-proj.jar"]
