# Spring Cloud Microservices

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

> A comprehensive demonstration of Spring Cloud capabilities through a microservices architecture.
### Project Overview

> This project showcases key microservices patterns and Spring Cloud features including:
> Centralized Configuration (Config Server)
> Service Discovery (Eureka)
> API Gateway
> Inter-service Communication
> Containerization with Docker
> Architecture


### Build

```bash
# Generate Maven wrapper:

mvn -N io.takari:maven:wrapper

# Build all services:

./mvnw clean package -DskipTests

# Running the Application
Using Docker Compose:

docker-compose up -d

# serve with hot reload at localhost:8080
npm start

# build for production with minification
npm run build

# build for production and view the bundle analyzer report
npm run build --report
```

### Structure

The project consists of the following components:

Config Server (Port 8888)\
Service Registry (Port 8761)\
API Gateway (Port 8080)\
Service A (Port 8081)\
Service B (Port 8082)\

### Prerequisites

Java 17\
Maven\
Docker\
Docker Compose

### Project Structure

spring-cloud-microservices/\
├── config-server/\
├── service-registry/\
├── api-gateway/
├── service-a/\
├── service-b/\
├── docker-compose.yml\
└── pom.xml\


### Service Endpoints

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

## License
This project is licensed under the MIT License.
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)