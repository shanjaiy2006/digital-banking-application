# BankFlow API - Financial Transactions Backend

A robust, secure, and scalable banking backend built with **Spring Boot**. This system manages core banking operations including customer lifecycle management, multi-role access control, multi-currency accounts, real-time transaction processing, and rigorous financial validation.

---

## 🚀 Features

### 👥 User & Identity Management
*   **Customer Registration:** Secure signup for new clients with built-in validation.
*   **Role-Based Access Control (RBAC):** Distinct permissions enforced across **Admin** and **Customer** roles.
    *   *Customer:* Manage personal accounts, perform transactions, view histories, and download statements.
    *   *Admin:* Monitor all platform transactions, audit accounts, and override global validation parameters.

### 🏦 Core Banking Operations
*   **Account Lifecycle:** Support for multiple accounts per customer (e.g., Checking, Savings).
*   **Deposits & Withdrawals:** Secure endpoints to inject or extract liquidity with atomic balance updates.
*   **Inter-Account Transfers:** Real-time, transaction-safe fund transfers between internal accounts.

### 📊 Auditing & Reporting
*   **Transaction History:** Immutable ledger recording structural details (timestamps, transaction IDs, statuses, and types).
*   **Account Statements:** Generates detailed time-bound statement reports suitable for printing or auditing.

### 🛡️ Transaction Validation & Security
*   **Balance Guard:** Strict checks to prevent overdrafts on non-credit accounts.
*   **Velocity & Limit Thresholds:** Rejects transactions violating security rules (e.g., negative amounts, single-transfer limits).
*   **Thread Safety:** Handled using database-level locking (`PESSIMISTIC_WRITE`) to completely eliminate race conditions during concurrent financial updates.

---

## 🛠️ Technology Stack

*   **Framework:** Spring Boot 3.x
*   **Language:** Java 17 / 21
*   **Database:** PostgreSQL / MySQL (with Hibernate/Spring Data JPA)
*   **Security:** Spring Security & JWT (JSON Web Tokens)
*   **Build Tool:** Maven / Gradle

---

## 📋 Database Schema Design (Core Entities)

