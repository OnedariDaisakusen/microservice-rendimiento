# Usamos una imagen base oficial de Java 17
FROM eclipse-temurin:17-jdk-alpine

# Establecemos el directorio de trabajo en el contenedor
WORKDIR /app

# Copiamos el archivo JAR generado por el proyecto al contenedor
COPY target/api-rendimiento-0.0.1-SNAPSHOT.jar app.jar


# Exponemos el puerto en el que correrá la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]