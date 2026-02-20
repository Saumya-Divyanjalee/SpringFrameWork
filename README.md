#  Spring Boot POS System

---

## 🎥 System Demonstration Video

Click the thumbnail below to watch the full system demo 👇

 

[![Watch the Demo](https://img.youtube.com/vi/LctGVfKfzKg/0.jpg)](https://youtu.be/LctGVfKfzKg)

https://youtu.be/LctGVfKfzKg

---

## 📌 Project Summary Explanation

This project is a full-stack Point of Sale (POS) System developed using Spring Boot as the backend REST API and JavaScript as the frontend user interface.

The system demonstrates how modern web applications communicate using REST APIs and AJAX to manage customer details, item data and order processing with real-time inventory control.

---

### 🔹 API (Application Programming Interface)

API is a mechanism that allows two different systems to communicate with each other.

In this system:
- Frontend JavaScript acts as the client  
- Spring Boot acts as the API  
- MySQL Database acts as the data storage  

All frontend requests are sent to the backend API, and the backend interacts with the database to retrieve or update data.

---

### 🔹 REST API

REST API follows standard HTTP methods to perform CRUD operations:

- **GET** → Retrieve data  
- **POST** → Create new records  
- **PUT** → Update existing records  
- **DELETE** → Remove records  

Spring Boot processes these HTTP requests and returns JSON responses to the client.

---

### 🔹 AJAX

AJAX allows JavaScript to send HTTP requests to the backend without reloading the web page.

In this POS system:
- Customer data updates instantly  
- Orders are processed in real-time  
- Item stock updates automatically after each order  

All communication between frontend and backend is handled using the JavaScript `fetch()` function.

---

### 🔹 Layered Architecture

The project is divided into multiple layers:

- **Controller Layer** → Handles HTTP requests  
- **Service Layer** → Contains business logic  
- **Repository Layer** → Handles database operations  
- **Database Layer** → Stores data  

Each layer performs a specific task ensuring Separation of Concerns.

---

### 🔹 DTO & Entity

- **DTO (Data Transfer Object)** is used to transfer validated data between frontend and backend  
- **Entity** represents the database table  

Hibernate automatically maps Entity classes to MySQL database tables.

---

### 🔹 Global Exception Handling

GlobalExceptionHandler ensures that all system errors such as validation failures and custom exceptions are handled in one place and meaningful responses are returned to the frontend.

---

### 🔹 API Response Structure

All API responses follow a consistent format:

```
{
  status: 200,
  message: "Success",
  data: {...}
}
```

---

## ⚙️ Technologies Used

- Spring Boot  
- Java  
- Hibernate (JPA)  
- MySQL  
- JavaScript  
- AJAX  
- Maven  
- Lombok  
- ModelMapper  

---

## 👩‍💻 Developed By
Saumya Divyanjalee  
Undergraduate - IJSE
