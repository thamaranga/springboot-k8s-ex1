FROM openjdk:8
ADD target/springboot-k8s-ex1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
