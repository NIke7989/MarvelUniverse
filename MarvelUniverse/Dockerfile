# Use Maven to build the project
FROM maven:3.8.6-openjdk-17-slim AS build

# Set the working directory for the build process
WORKDIR /app

# Copy the pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code into the container
COPY src ./src

# Build the project and package the application
RUN mvn clean package -DskipTests

# Use a smaller JDK base image for the runtime environment
FROM openjdk:17-slim

# Set the working directory in the second image
WORKDIR /app

# Copy the built .jar file from the build stage to the runtime image
COPY --from=build /app/target/MarvelUniverse-*.jar app.jar

# Expose the application port
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
