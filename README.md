# petstore-user-api-tests

## Project Overview

**petstore-user-api-tests** is a Java-based API automation testing project designed to demonstrate CRUD (Create, Read, Update, Delete) operations on the **Swagger Petstore** `/user` endpoint using **RestAssured** and **TestNG**.  

This project follows a clean, modular structure — separating configuration, models, API calls, and test logic — to reflect real-world QA automation best practices.  
It’s ideal for learning and demonstrating skills in **REST API testing**, **framework design**, and **Java-based automation**.

---

## Features

- Implements **CRUD operations** (`POST`, `GET`, `PUT`, `DELETE`) for user API testing.  
- Uses **RestAssured** for HTTP requests and **TestNG** for managing test execution and assertions.  
- Models API request/response data with **Lombok** for concise POJOs.  
- Centralized configuration for **Base URI** and environment setup.  
- Clean folder structure for better readability and scalability.  
- Easy to run on any machine with **Java 17** and **Maven** installed.  

---

## Tech Stack

| Tool | Purpose |
|------|----------|
| **Java 17** | Programming language |
| **RestAssured** | API automation and HTTP requests |
| **TestNG** | Test framework for running and structuring tests |
| **Lombok** | Simplifies POJO creation with annotations |
| **Maven** | Build tool and dependency manager |

---

## Installation & Setup

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/<your-username>/petstore-user-api-tests.git
cd petstore-user-api-tests
