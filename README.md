Spring Cloud Microservices Demo
A comprehensive demonstration of Spring Cloud capabilities through a microservices architecture.
Project Overview
This project showcases key microservices patterns and Spring Cloud features including:
Centralized Configuration (Config Server)
Service Discovery (Eureka)
API Gateway
Inter-service Communication
Containerization with Docker
Architecture
The project consists of the following components:
Config Server (Port 8888)
Service Registry (Port 8761)
API Gateway (Port 8080)
Service A (Port 8081)
Service B (Port 8082)
Prerequisites
Java 17
Maven
Docker
Docker Compose
Project Structure
text
spring-cloud-microservices/
├── config-server/
├── service-registry/
├── api-gateway/
├── service-a/
├── service-b/
├── docker-compose.yml
└── pom.xml

Building the Project
Generate Maven wrapper:
bash
mvn -N io.takari:maven:wrapper

Build all services:
bash
./mvnw clean package -DskipTests

Running the Application
Using Docker Compose:
bash
docker-compose up -d

Service Endpoints
Eureka Dashboard: http://localhost:8761
Service A (via Gateway): http://localhost:8080/service-a/data
Service B (via Gateway): http://localhost:8080/service-b/info
Health Endpoints:
http://localhost:8080/service-a/health
http://localhost:8080/service-b/health
Features Demonstrated
Service Registration and Discovery
Centralized Configuration
Load Balancing
API Gateway Routing
Inter-service Communication
Containerized Deployment
Health Monitoring
Docker Commands
View logs: docker-compose logs -f
Stop services: docker-compose down
Rebuild services: docker-compose up -d --build
Technologies Used
Spring Boot 3.2.0
Spring Cloud 2023.0.0
Docker
Maven
Contributing
Feel free to submit issues and enhancement requests.
License
This project is licensed under the MIT License.
