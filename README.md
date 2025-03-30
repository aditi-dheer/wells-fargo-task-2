# Wells Fargo Software Engineering Job Simulation:

## 📊 Financial Advisor System - Data Model & Implementation

## 📌 Overview

This project is part of a software development initiative aimed at creating a new system for financial advisors at **Wells Fargo**. The system is designed to assist financial advisors in managing client portfolios more efficiently. The project is divided into two main parts:  

**Part 1** - 🏗️ Designing and visualizing a data model for the system.  
**Part 2** - 💻 Implementing the data model using Java Persistence API (JPA) with the Spring framework.

## 📖 What I Learned

✔️ The importance of a well-structured data model in software development.  
✔️ How to create an **Entity-Relationship Diagram (ERD)** to represent system entities and their relationships.  
✔️ How to use **Java Persistence API (JPA)** to map Java objects to database tables efficiently.  
✔️ How to use **Spring** to integrate JPA and build backend systems.  
✔️ The significance of relational database design in ensuring scalability and maintainability of a system.  
✔️ The role of **annotations** such as `@Entity`, `@Id`, `@OneToMany`, and `@ManyToOne` in defining entity relationships and managing database operations.

## 🛠️ Technologies Used

🖥️ **ERD Tool:** Miro  
🏗️ **Framework:** Spring Boot (for backend development)  
☕ **Programming Language:** Java  
🔄 **ORM Tool:** Java Persistence API (JPA)  
🖥️ **IDE:** IntelliJ IDEA  
🔀 **Version Control:** Git & GitHub

---

## 🏗️ Part 1: Data Model Design

## 📖 What I Learned

✔️ The importance of a well-structured data model in software development.  
✔️ How to create an **Entity-Relationship Diagram (ERD)** to represent system entities and their relationships.

## 📝 Methodology

**🔍 Requirement Analysis:**  

🏦 The system must manage **financial advisors** and their **clients**.  
🔄 Each **advisor** can have **multiple clients**, and each client has a **portfolio**.  
📈 Portfolios contain securities, each with attributes like name, category, purchase date, purchase price, and quantity.  
⚡ The system should be highly available (99% uptime) and expose a React dashboard.  
🔧 The backend must be developed using Spring with a relational database.  

**🗺️ Data Modeling:**  

🏷️ Identified key entities: **FinancialAdvisor, Client, Portfolio, Security**.  
🔗 Defined relationships:  

- One-to-Many (Advisor → Clients)  
- One-to-Many (Client → Portfolios)  
- One-to-Many (Portfolio → Securities)  

📌 Created an **ERD** using **Miro** to visualize relationships.

### 🛠️ Technologies Used

🖥️ **ERD Tool:** Miro  
🏗️ **Framework:** Spring (for backend development)

## 💻 Part 2: Implementing the Data Model

## 📖 What I Learned

✔️ The purpose and functionality of **Java Persistence API (JPA)** as an object-relational mapping (ORM) tool.  
✔️ How to integrate **JPA with Spring** to manage database entities.  
✔️ The importance of annotations such as `@Entity`, `@Id`, `@OneToMany`, and `@ManyToOne` in defining entity relationships.

## 🛠️ Implementation Steps

### Setup & Preparation:

🍴 Forked and cloned the starter repository.  
🛠️ Installed and configured **IntelliJ** as the development environment.  
🔍 Explored the provided **codebase** to understand project structure.  

### Entity Creation:

🏷️ Created Java classes for **FinancialAdvisor**, **Client**, **Portfolio**, and **Security** in the `entities` directory.  
🏗️ Used **JPA annotations** to define relationships:  

- `@OneToMany(mappedBy = "advisor")` for **FinancialAdvisor-Client** relationship.  
- `@OneToMany(mappedBy = "client")` for **Client-Portfolio** relationship.  
- `@OneToMany(mappedBy = "portfolio")` for **Portfolio-Security** relationship.  

📌 Ensured each entity has:  
- ✅ An **auto-generated ID**  
- ✅ A **constructor**  
- ✅ **Getter/setter methods**

### Commit & Push:

💾 Committed all changes to the **repository**.  
🚀 Pushed the implementation to **GitHub**.

### 🛠️ Technologies Used

☕ **Programming Language:** Java  
🏗️ **Framework:** Spring Boot  
🔄 **ORM Tool:** Java Persistence API (JPA)  
🖥️ **IDE:** IntelliJ IDEA  
🔀 **Version Control:** Git & GitHub
