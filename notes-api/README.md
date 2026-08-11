# Notes API

A Spring Boot REST API for creating, managing, and organizing user-owned notes.

## Features

- User registration and login
- JWT-based authentication
- BCrypt password hashing
- User ownership and authorization
- Create, read, update, and delete notes
- Pagination, sorting, and searching
- Request validation
- Global exception handling
- DTO-based request/response models
- Swagger / OpenAPI documentation
- SLF4J logging
- MySQL with Spring Data JPA / Hibernate

## Tech Stack

- Java
- Spring Boot 4.x
- Spring Security
- JWT
- Spring Data JPA / Hibernate
- MySQL
- Maven
- Swagger / OpenAPI
- SLF4J

## Prerequisites

- Java 17+
- Maven 3.8+
- MySQL

## Getting Started

### Run locally

```bash
./mvnw spring-boot:run
```

The API starts by default at:

```text
http://localhost:8080/notes-api/v1
```

### Build

```bash
./mvnw clean install
```

### Run tests

```bash
./mvnw test
```

## Configuration

Configuration lives in `src/main/resources/application.properties`.

Example:

```properties
spring.application.name=notes-api
server.port=8080
server.servlet.context-path=/notes-api/v1

spring.datasource.url=jdbc:mysql://localhost:3306/notesDB
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.security.jwt.securitykey=your_256_bit_secret
spring.security.expiration_time=your_expiration_time
```

**Do not commit real database credentials or JWT secrets to the repository.**

## Swagger / OpenAPI

Swagger UI:

```text
http://localhost:8080/notes-api/v1/swagger-ui/index.html
```

OpenAPI specification:

```text
http://localhost:8080/notes-api/v1/v3/api-docs
```

The API uses JWT Bearer authentication. Use Swagger's **Authorize** button and provide a valid JWT before calling secured endpoints.

## Authentication

### Register

```http
POST /auth/register
```

Creates a new user.

### Login

```http
POST /auth/login
```

Authenticates the user and returns a JWT.

Use the returned token for secured requests:

```http
Authorization: Bearer <JWT>
```

## API Endpoints

### Authentication

| Method | Endpoint         | Auth   | Description                    |
| ------ | ---------------- | ------ | ------------------------------ |
| POST   | `/auth/register` | Public | Register a new user            |
| POST   | `/auth/login`    | Public | Authenticate and receive a JWT |

### Notes

| Method | Endpoint      | Auth | Description                                  |
| ------ | ------------- | ---- | -------------------------------------------- |
| GET    | `/notes`      | JWT  | Get the authenticated user's notes           |
| GET    | `/notes/{id}` | JWT  | Get one of the authenticated user's notes    |
| POST   | `/notes`      | JWT  | Create a note for the authenticated user     |
| PUT    | `/notes/{id}` | JWT  | Update one of the authenticated user's notes |
| DELETE | `/notes/{id}` | JWT  | Delete one of the authenticated user's notes |

### Pagination, sorting and searching

Example:

```text
GET /notes?pageNo=0&pageSize=1&sortField=title&order=asc
```

The listing endpoint returns the authenticated user's notes as a paginated response.

## Authorization Model

Each note belongs to one user.

A user cannot read, update, or delete another user's notes. Note lookup also considers the authenticated user's ID, so an inaccessible note is treated as not found rather than revealing ownership information.

## Project Structure

```text
notes-api
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.khush.notes_api
│   │   │       ├── advice
│   │   │       ├── config
│   │   │       ├── controller
│   │   │       ├── dto
│   │   │       ├── entity
│   │   │       ├── exceptions
│   │   │       ├── filters
│   │   │       ├── mapper
│   │   │       ├── repository
|   |   |       ├── security
│   │   │       └── service
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
├── pom.xml
└── README.md
```

## Database

The application uses MySQL with JPA/Hibernate.

```text
User 1 ─────────── * Notes
```

A user can have multiple notes, while each note belongs to one user.

## DTOs and API Responses

The API uses DTOs for request and response payloads instead of exposing JPA entities directly.

This keeps responses clean and avoids recursive JSON serialization caused by the bidirectional `User` ↔ `Notes` relationship.

## Error Handling

Application exceptions are handled centrally through a global exception handler.

The API returns appropriate HTTP status codes for invalid requests, authentication failures, unauthorized access, and missing resources.

## Logging

Application events and errors are logged using SLF4J instead of `System.out.println()`.

## Security

The application uses:

- Spring Security
- `DaoAuthenticationProvider`
- Custom `UserDetailsService`
- BCrypt password encoding
- JWT authentication
- Stateless security sessions
- Custom JWT filter
- `SecurityContext` for authenticated-user information

Authentication and Swagger/OpenAPI resources are public; protected API endpoints require a valid JWT.

## Future / Optional Features

- Login using username or email
- JWT logout / token invalidation strategy
- Refresh tokens
- Role-based authorization
- Password change/reset
- Email verification
- Angular frontend
