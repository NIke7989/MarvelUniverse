# Use an official Maven image to build the project
FROM maven:latest AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and dependencies for the Maven build
COPY pom.xml .

# Download the project dependencies (this is an optimization to avoid downloading dependencies each time)
RUN mvn dependency

# Copy the source code into the container
COPY src ./src

# Build the project and package the application
RUN mvn clean package

# Use a smaller JDK base image to run the application
FROM openjdk:17-slim

# Set the working directory in the second image
WORKDIR /app

# Copy the packaged .jar file from the build stage to the runtime image
COPY --from=build /app/target/MarvelUniverse-*.jar app.jar

# Expose the port that your application will run on
EXPOSE 8080

# Set the entrypoint to run the Java application
ENTRYPOINT ["java", "-jar", "app.jar"]
