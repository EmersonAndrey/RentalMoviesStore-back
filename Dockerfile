# imagem do java
FROM openjdk:17-jdk-slim

# diretorio de trabalho
WORKDIR /app

# copiando JAR jerado pelo maven
COPY target/*.jar app.jar

# expondo porta que o spring roda
EXPOSE 8080

# comando para rodar a aplicacao
CMD ["java", "-jar", "app.jar"]