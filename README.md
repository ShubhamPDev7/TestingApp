# 🧪 Spring Boot Testing App

This project is built to learn and implement **Unit Testing** and **Integration Testing** in a Spring Boot application using industry-standard tools.

---

## 🚀 Tech Stack

- Java 21+
- Spring Boot
- Spring Data JPA
- JUnit 5
- Mockito
- Testcontainers
- PostgreSQL (via Testcontainers)
- JaCoCo (Code Coverage)

---

## 📚 What I Learned

This project covers:

- ✅ Basics of testing in Spring Boot
- ✅ JUnit & AssertJ usage
- ✅ Unit Testing vs Integration Testing
- ✅ Repository layer testing using Testcontainers
- ✅ Mocking dependencies using Mockito
- ✅ Service layer unit testing
- ✅ Writing Integration Tests
- ✅ Generating Code Coverage Reports with JaCoCo

---

## 🧱 Project Structure
#### src/
#### ├── main/
#### │ ├── java/
#### │ │ └── com/shubham/testingapp/
#### │ │ ├── controllers/
#### │ │ ├── services/
#### │ │ ├── repositories/
#### │ │ ├── entities/
#### │ │ └── dto/
#### │ └── resources/
#### │ └── application.properties
#### │
#### └── test/
#### ├── unit/
#### ├── integration/
#### └── TestContainerConfiguration.java


---

## 🧪 Testing Approach

### 🔹 Unit Testing
- Uses **Mockito** to mock dependencies
- Focuses on testing business logic in isolation
- Example:
    - Service layer testing with mocked repository

### 🔹 Integration Testing
- Uses **Testcontainers** with PostgreSQL
- Tests full flow (Repository → DB)
- Ensures real database interaction works correctly

---

## ⚙️ Running Tests

```bash
mvn clean test
```
📊 Code Coverage (JaCoCo)

To generate report:

```bash
mvn clean verify
```
Then open:

```bash
target/site/jacoco/index.html
```
## 🐳 Testcontainers Setup
Automatically spins up a PostgreSQL container during tests
No need to install database locally

### 📌 Key Features
Clean test structure (unit + integration)
Real DB testing using containers
Mock-based testing for fast execution
Coverage reporting

## 🎯 Goal of This Project

To build strong fundamentals in backend testing and write production-ready test cases used in real-world Spring Boot applications.

### ⭐ Future Improvements
Add Controller layer tests
Add REST API validation tests
CI/CD integration (GitHub Actions)
Dockerize full application

