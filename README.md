# Microservice Example

## Overview

This project is an educational example designed to explore and understand the core concepts of microservices architecture. It demonstrates how to build a distributed system using modern technologies and best practices for inter-service communication.

This repository focuses on learning and experimentation: it integrates different technologies in a single example to illustrate how microservices interact. The project explores both asynchronous messaging (RabbitMQ) and REST-style interactions where appropriate, while emphasizing software design patterns and code quality principles.

## Technologies Used

| Technology                                                                                                        | Description                                                                                                                      |
| ----------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| ![Java](https://img.shields.io/badge/Java%2017-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)           | Java 17 - Modern Java platform for building scalable applications                                                                |
| ![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)             | Spring Framework - Comprehensive framework for building Java applications with dependency injection and configuration management |
| ![REST](https://img.shields.io/badge/REST-005571?style=for-the-badge&logo=fastapi&logoColor=white)                | REST architecture - HTTP-based interaction style used where appropriate to expose endpoints and resources                        |
| ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)         | Maven - Build automation and dependency management                                                                               |
| ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white) | PostgreSQL - Relational database used in the User microservice                                                                   |
| ![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)                | MySQL - Relational database used in the Email microservice                                                                       |
| ![RabbitMQ](https://img.shields.io/badge/RabbitMQ-FF6600?style=for-the-badge&logo=rabbitmq&logoColor=white)       | RabbitMQ - Message broker for asynchronous communication between services                                                        |
| ![CloudAMQP](https://img.shields.io/badge/CloudAMQP-36C5F0?style=for-the-badge&logo=rabbitmq&logoColor=white)     | CloudAMQP - Managed RabbitMQ service in the cloud                                                                                |

## Project Purpose

This example project serves as a learning resource to:

- **Understand Microservices**: Learn how to break down monolithic applications into independent, loosely-coupled services
- **Spring Framework Expertise**: Master dependency injection, configuration management, and Spring's comprehensive ecosystem for building robust applications
- **Service Communication**: Explore asynchronous messaging patterns using RabbitMQ for inter-service communication
- **Database Independence**: Practice the database per service pattern by demonstrating how different microservices can use different database technologies (PostgreSQL for User service, MySQL for Email service)
- **Data Persistence**: Understand how to design and manage multiple databases independently across different services
- **Build Automation**: Implement build processes and dependency management using Maven
- **Cloud Integration**: Understand how to integrate cloud-based services like CloudAMQP
- **REST Architecture**: Understand where REST-style interactions fit alongside message-driven patterns; learn to expose HTTP resources when appropriate
- **Design Patterns & Code Quality**: Apply design patterns and code-quality practices such as Clean Code, SOLID principles, and other best practices to keep services maintainable and testable

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher
- PostgreSQL 18 or higher (for User microservice)
- MySQL 8 or higher (for Email microservice)
- Docker (optional, for RabbitMQ)

### Installation

1. Clone the repository
2. Configure your PostgreSQL database (for User microservice)
3. Configure your MySQL database (for Email microservice)
4. Set up RabbitMQ (locally or use CloudAMQP)
5. Build the project with Maven: `mvn clean install`
6. Run the services

## Architecture

This project demonstrates a microservices architecture where:

- **User Microservice**: Manages user-related data using PostgreSQL as its database
- **Email Microservice**: Handles email operations using MySQL as its database
- Each service has its own independent database, showcasing the database per service pattern
- Services communicate asynchronously through RabbitMQ; REST-style endpoints may be used where appropriate for interactivity or integration
- Services are independently deployable and scalable
- Data consistency is maintained through event-driven patterns
- The use of different database technologies for different services demonstrates the independence and flexibility of each microservice to choose its own data storage solution
- Design patterns and code quality practices (Clean Code, SOLID, etc.) are applied throughout the codebase to improve maintainability and readability

## Learning Outcomes

By studying this project, you will understand:

- REST architecture and when to use HTTP-based resource interactions alongside messaging
- Design patterns and code-quality practices such as Clean Code and SOLID principles

---

**Note**: This is an educational project for learning purposes. For production use, additional considerations such as service discovery, API gateways, monitoring, and logging should be implemented.
