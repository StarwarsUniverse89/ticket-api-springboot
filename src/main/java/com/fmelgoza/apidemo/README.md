# Ticket Management API

A Spring Boot REST API for managing support tickets.

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