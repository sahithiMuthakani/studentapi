# Employee CRUD REST API

## 📌 Project Description
This project implements a CRUD REST API using Spring Boot.

It supports:
- Create Employee
- Get All Employees
- Get Employee By ID
- Update Employee
- Delete Employee

---

## 🚀 Technologies Used
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Jakarta Validation
- Maven

---

## 📂 Endpoints

### ✅ Create Employee
POST /employees

### ✅ Get All Employees
GET /employees

### ✅ Get Employee By ID
GET /employees/{id}

### ✅ Update Employee
PUT /employees/{id}

### ✅ Delete Employee
DELETE /employees/{id}

---

## 🔎 Validation Rules
- Name cannot be blank
- Email must be valid
- Salary must be positive

---

## 🧪 Sample JSON for POST/PUT

```json
{
  "name": "John",
  "email": "john@gmail.com",
  "salary": 50000
}