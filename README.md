# JdbcStudent

## Student Information Management: CRUD Operations with JDBC Template

### Description

This project is a Spring Boot application that manages student information using CRUD operations with JDBC Template. It allows users to perform Create, Update, and Delete operations on student records stored in a relational database. The project aims to simplify student data management and provide an efficient way to maintain academic records. It ensures data consistency, quick access, and ease of use with a lightweight and scalable solution.

### Technologies Used

- Java
- Spring Boot
- JDBC Template
- MySQL
- Maven
- REST API

### Student Object Structure

The student entity in this project consists of the following attributes:

```json
{
  "id": 107,
  "name": "john",
  "marks": 79,
  "grade": "C",
  "city": "Chennai"
}
```

Each student has a unique ID, a name, marks obtained, a grade assigned based on marks, and a city of residence.

### API Endpoints

- **Create Student** (POST `/student/add`) - Adds a new student record to the database.
- **Update Student** (PUT `/student/update`) - Updates the details of an existing student.
- **Delete Student** (DELETE `/students/delete/{id}`) - Removes a specific student record from the database.

**Swagger URL: http://localhost:8080/swagger-ui/index.html#**

### Setup Instructions

1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/JdbcStudent.git
   ```
2. Navigate to the project directory:
   ```sh
   cd JdbcStudent
   ```
3. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/student_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   ```
4. Install dependencies and build the project:
   ```sh
   mvn clean install
   ```
5. Run the application:
   ```sh
   mvn spring-boot:run
   ```
6. Test the API using Postman, Swagger UI or any API testing tool.

---
## Response
The API returns a response confirming the received data or indicating an error if validation fails.

### Success Response
```
Student updated successfully
```

### Error Response
```
Error: response status is 400

Response body
{
  "timestamp": "2025-02-08T18:12:41.566+00:00",
  "status": 400,
  "error": "Bad Request",
  "path": "/api/student/update"
}
```

---

## Swagger UI Screenshots (For Reference)

## 1. Create operation
<br>
<img width="726" alt="InsertStu1" src="https://github.com/user-attachments/assets/3ca9dcb7-2aa0-404c-804b-6d9a200839e0" />
<img width="722" alt="InsertStu2" src="https://github.com/user-attachments/assets/1308bcff-de36-463a-8583-65ff1f2173a5" />
<br>
<br>

## 2. Update operation
<br>
<img width="731" alt="UpdateStu1" src="https://github.com/user-attachments/assets/ba69ba66-adf6-4137-a7d6-26f402517536" />
<img width="725" alt="UpdateStu2" src="https://github.com/user-attachments/assets/3215fb51-8a24-44b7-a870-2595f04663ee" />
<br>
<br>


## 3. Delete operation
<br>
<img width="735" alt="Screenshot 2025-02-08 at 11 01 19 PM" src="https://github.com/user-attachments/assets/6b35ad8b-28ee-41a6-832f-0b5f29e03721" />
<br>
<br>



This project is a great starting point for understanding Spring Boot with JDBC Template and handling database operations efficiently.
