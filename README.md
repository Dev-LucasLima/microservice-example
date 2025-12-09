# Microservice Example

## Overview

This project is an educational example designed to explore and understand the core concepts of microservices architecture. It demonstrates how to build a distributed system using modern technologies and best practices for inter-service communication. The project explores both asynchronous messaging (RabbitMQ) and synchronous REST APIs, while emphasizing software design patterns and code quality principles like SOLID and Clean Code.

## Technologies Used

| Technology                                                                                                        | Description                                                                                                                      |
| ----------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)                | Java 17 - A modern, long-term support (LTS) version of Java for building scalable applications.                                  |
| ![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)             | Spring Framework - Comprehensive framework for building Java applications with dependency injection and configuration management |
| ![REST](https://img.shields.io/badge/REST%20API-005571?style=for-the-badge&logo=fastapi&logoColor=white)          | REST API - HTTP-based interaction style for exposing resources and enabling synchronous communication.                           |
| ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)         | Maven - Build automation and dependency management                                                                               |
| ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white) | PostgreSQL - Relational database used in the User microservice                                                                   |
| ![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)                | MySQL - Relational database used in the Email microservice                                                                       |
| ![RabbitMQ](https://img.shields.io/badge/RabbitMQ-FF6600?style=for-the-badge&logo=rabbitmq&logoColor=white)       | RabbitMQ - Message broker for asynchronous communication between services                                                        |
| ![CloudAMQP](https://img.shields.io/badge/CloudAMQP-36C5F0?style=for-the-badge&logo=rabbitmq&logoColor=white)     | CloudAMQP - Managed RabbitMQ service in the cloud                                                                                |
| ![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)                | Gmail - Mail server to send email                                                                                                |

## Project Purpose

This example project serves as a learning resource to:

- **Understand Microservices**: Decompose a monolith into independent, loosely-coupled services.
- **Master Spring Framework**: Utilize dependency injection, configuration management, and the Spring ecosystem.
- **Explore Service Communication**: Implement asynchronous messaging with RabbitMQ and synchronous REST APIs.
- **Practice Database-per-Service**: Use different databases (PostgreSQL, MySQL) for different services.
- **Apply Design Patterns & Code Quality**: Implement SOLID, Clean Code, and other best practices for maintainable services.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.8 or higher
- PostgreSQL 16 or higher (for User microservice)
- MySQL 8 or higher (for Email microservice)
- Docker and Docker Compose (optional, for local RabbitMQ setup)

### Installation

1. **Clone the repository:**

   ```sh
   git clone https://github.com/Dev-LucasLima/microservice-example
   cd microservice-example
   ```

2. **Configure Databases:**
   - Update the `application.properties` file in the `user-service` with your PostgreSQL connection details.
   - Update the `application.properties` file in the `email-service` with your MySQL connection details.
3. **Set up RabbitMQ:**
   - Sign up for a free plan on CloudAMQP and update the `application.properties` in each service with your instance URL.
4. **Configure Gmail:**

   - Create new Gmail account
   - Configure App password
     - Gmail documentation to create App Password: [here](https://support.google.com/mail/answer/185833)
   - Update the `application.properties` file in the `email-service` with your SMTP connetion details.

> [!IMPORTANT]  
> If you want other mail server, consult documentation this mail server to configure the `application.properties`

5. **Build the Project:**

   ```sh
   mvn clean install
   ```

6. **Run the Services:**
   Open two separate terminals and run the following commands:

   ```sh
   # Terminal 1: Run User Service
   java -jar user-service/target/user-service-*.jar

   # Terminal 2: Run Email Service
   java -jar email-service/target/email-service-*.jar
   ```

## Architecture

This project demonstrates a microservices architecture where:

- **User Microservice**: Manages user-related data using PostgreSQL as its database
- **Email Microservice**: Handles email operations using MySQL as its database
- Each service has its own independent database, showcasing the database per service pattern
- Services communicate asynchronously via RabbitMQ for event-driven workflows (e.g., sending a welcome email on user creation).
- Synchronous communication is handled via REST APIs where immediate responses are needed.
- Services are independently deployable and scalable
- Data consistency is maintained through event-driven patterns
- The use of different database technologies for different services demonstrates the independence and flexibility of each microservice to choose its own data storage solution
- Design patterns and code quality practices (Clean Code, SOLID, etc.) are applied throughout the codebase to improve maintainability and readability

---

**Note**: This is an educational project for learning purposes. For production use, additional considerations such as service discovery, API gateways, monitoring, and logging should be implemented.
