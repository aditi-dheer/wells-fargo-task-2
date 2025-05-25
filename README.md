# Wells Fargo Software Engineering Job Simulation

A two-part backend engineering project simulating the design and implementation of a financial advisor system for **Wells Fargo**.

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/JPA-59666C?style=for-the-badge" alt="JPA" />
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white" alt="IntelliJ IDEA" />
</p>

---

## 🔍 Project Overview

This system helps financial advisors manage clients and portfolios. Built using **Java**, **JPA**, and **Spring Boot**, it follows a relational model with clear entity relationships.

---

## System Design

**Entities & Relationships:**
- `FinancialAdvisor` → One-to-Many → `Client`
- `Client` → One-to-Many → `Portfolio`
- `Portfolio` → One-to-Many → `Security`

**Key Attributes:**
- Each security stores name, category, purchase date, price, and quantity.
- Designed for scalability and integration with a React-based dashboard.

**Tools Used:**
| Tool         | Purpose                      |
|--------------|------------------------------|
| Miro         | ERD design                   |
| Java         | Core development             |
| Spring Boot  | Backend framework            |
| JPA          | Object-relational mapping    |
| IntelliJ     | Development environment      |
| Git & GitHub | Version control              |

---
This simulation focused on real-world backend development patterns, using clean architecture and relational database principles to deliver a maintainable system for financial services.
