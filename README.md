# 💎 Expense Tracker (Full Stack)

A modern full-stack Expense Tracker application built using **Java Spring Boot** for backend and **HTML, CSS, JavaScript** for frontend.

This application allows users to manage expenses, track spending, and view category-wise summaries with a clean and responsive UI.

---

## 🚀 Features

- ✅ Add, update, and delete expenses (CRUD operations)
- 📊 Category-wise expense summary (analytics)
- 🔐 Input validation using annotations
- ⚡ RESTful API architecture
- 🎯 Clean layered backend (Controller → Service → Repository)
- 💎 Glassmorphism UI with smooth animations
- 🌙 Dark / Light mode toggle

---

## 🛠️ Tech Stack

### Backend:
- Java
- Spring Boot
- Spring Data JPA
- H2 Database

### Frontend:
- HTML
- CSS (Glass UI + animations)
- JavaScript (Fetch API)

---

## 🏗️ Project Architecture
Controller → Service → Repository → Database

- **Controller** → Handles HTTP requests  
- **Service** → Business logic  
- **Repository** → Database interaction  

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|------|--------|-------------|
| GET | `/expenses` | Get all expenses |
| POST | `/expenses` | Add new expense |
| PUT | `/expenses/{id}` | Update expense |
| DELETE | `/expenses/{id}` | Delete expense |
| GET | `/expenses/summary` | Category-wise summary |

---

## ▶️ How to Run

### 1. Clone the repository
```bash
git clone https://github.com/your-username/expense-tracker.git


2. Run backend

Open project in VS Code / IntelliJ

Run DemoApplication.java

3. Open frontend

Open index.html in browser
OR

Place it inside:

src/main/resources/static/

Then open:

http://localhost:8080/index.html
