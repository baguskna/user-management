# User Management Spring Boot Application

This project is a demo Spring Boot application for user management, using Java 21, Spring Boot 3.5.3, PostgreSQL, and Lombok.

## How to Run

### Prerequisites

- Java 21 installed
- Maven (or use the provided `mvnw` wrapper)
- PostgreSQL database (if you want to use the database features)

### Running the Application

1. **Clone or download the repository.**
2. **Navigate to the project root directory (where `pom.xml` is located).**
3. **Start the application using Maven Wrapper:**

   ```sh
   ./mvnw spring-boot:run
   ```

   Or, if you have Maven installed globally:

   ```sh
   mvn spring-boot:run
   ```

4. **Access the application:**
   - By default, it will run on [http://localhost:8080](http://localhost:8080)

### Building a JAR

To build a JAR file and run it manually:

```sh
./mvnw clean package
java -jar target/user-management-0.0.1-SNAPSHOT.jar
```


### Database Configuration

- The application uses PostgreSQL. Configure your database connection in `src/main/resources/application.properties`.

Example:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/user_management
spring.datasource.username=root
spring.datasource.password=12345
```

### Running PostgreSQL with Docker

If you don't have PostgreSQL installed locally, you can quickly start a PostgreSQL instance using Docker (works with OrbStack as well):

```sh
docker run --name user-management-postgres \
  -e POSTGRES_DB=user_management \
  -e POSTGRES_USER=root \
  -e POSTGRES_PASSWORD=12345 \
  -p 5432:5432 \
  -d postgres:16
```

This will start a PostgreSQL 16 container with the correct database, user, and password for this project.

### Testing

To run tests:

```sh
./mvnw test
```

---

## What Has Been Done

- Spring Boot project setup with Maven
- Dependencies for Spring Data JPA, Web, PostgreSQL, Lombok, and testing
- Maven wrapper included for easy build/run
- Ready for further development (add entities, controllers, etc.)

---

For more details, see the `pom.xml` and `application.properties` files.
