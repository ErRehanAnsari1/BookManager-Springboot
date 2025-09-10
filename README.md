# 📚 Book Manager - Spring Boot CRUD Application

A simple and functional RESTful API for managing a collection of books. This project is built to demonstrate the core concepts of Spring Boot, Spring Data JPA, and building REST APIs.

## 🚀 Features

- **Full CRUD Operations:** Create, Read, Update, and Delete books.
- **Database:** Uses in-memory **H2 Database** for easy development and testing.
- **API Testing:** Ready to be tested with **Postman**.
- **Built With:** Spring Boot, Spring Web, Spring Data JPA, H2 Database.

## 📋 API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/books` | Get all books |
| `GET` | `/api/books/{id}` | Get a book by its ID |
| `POST` | `/api/books` | Create a new book |
| `PUT` | `/api/books` | Update an existing book |
| `DELETE` | `/api/books/{id}` | Delete a book by ID |

## 🛠️ How to Run

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/ErRehanAnsari1/BookManager-Springboot.git
    ```
2.  **Open the project** in Spring Tool Suite (STS) or any IDE.
3.  **Run the application** by executing `BookManagerApplication.java`.
4.  **Access H2 Database Console:** Go to `http://localhost:8080/h2-console`
    - JDBC URL: `jdbc:h2:mem:testdb`
    - Username: `sa`
    - Password: `password`
5.  **Test APIs** using Postman on the endpoints mentioned above.

## 🗃️ Example JSON Request

**Create a Book (POST):**
```json
{
    "title": "Spring Boot in Action",
    "author": "Craig Walls"
}

#Developer:Rehan Ansari
LinkedIn:https://www.linkedin.com/in/rehan-ansari-17b910286?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app
