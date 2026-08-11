# Notes API

A Spring Boot REST API for creating, managing, and organizing notes.

## Features

- Create, read, update, and delete notes
- Search/filter notes by title or tag
- Timestamped creation and last-updated fields

## Prerequisites

- Java 17+
- Maven 3.8+
- Spring Boot 4.0.6

## Getting Started

### Run locally

```bash
cd notes-api
./mvnw spring-boot:run
```

The API will start on `http://localhost:8080` by default with a context path `/notes-api/v1`.

### Build

```bash
./mvnw clean install -U
```

### Run tests

```bash
./mvnw test
```

## Configuration

Configuration lives in `src/main/resources/application.properties`. Key settings:

```properties
spring.application.name = notes-api
server.port=8080
server.servlet.context-path = /notes-api/v1

spring.datasource.name=datasource
spring.datasource.url=jdbc:database://localhost:3306/notesDB
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto = update
spring.jpa.show-sql = true

spring.security.jwt.securitykey = ###
spring.security.expiration_time = time in milliseconds
```

## API Endpoints

| Method | Endpoint          | Description             |
| ------ | ----------------- | ----------------------- |
| GET    | `/api/notes`      | Get all notes           |
| GET    | `/api/notes/{id}` | Get a note by ID        |
| POST   | `/api/notes`      | Create a new note       |
| PUT    | `/api/notes/{id}` | Update an existing note |
| DELETE | `/api/notes/{id}` | Delete a note           |

### Sample Request

```bash
curl -X POST http://localhost:8084/api/notes \
  -H "Content-Type: application/json" \
  -d '{"title": "Grocery list", "content": "Milk, eggs, bread"}'
```

## Project Structure

```
notes-api
├── src
│   ├── main
│   │   ├── java        # Controllers, services, repositories, models
│   │   └── resources    # application.properties, static files
│   └── test
│       └── java         # Unit and integration tests
├── pom.xml
└── README.md
```
