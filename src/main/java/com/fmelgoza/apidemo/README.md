# Ticket Management API

A production-style Spring Boot REST API for managing tickets, 
featuring layered architecture, PostgreSQL integration, validation, 
global exception handling, and Docker containerization.

## Features
- Create, read, update, delete tickets
- Input validation
- Global error handling
- H2 in-memory database
- Layered architecture (Controller, Service, Repository)

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database

## Endpoints

### Get all tickets
GET /tickets

### Get ticket by ID
GET /tickets/{id}

### Create ticket
POST /tickets

### Update ticket
PUT /tickets/{id}

### Delete ticket
DELETE /tickets/{id}

## Example Request

```json
{
  "id": 1,
  "title": "Login issue",
  "status": "OPEN"
}
```  

## Run with Docker

### Build the image
docker build -t ticket-api .

### Run the container
docker run -p 8080:8080 \
-e SPRING_DATASOURCE_URL=jdbc:postgresql://host.docker.internal:5432/ticketdb \
-e SPRING_DATASOURCE_USERNAME="YOUR-USERNAME" \
ticket-api
