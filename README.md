# Simple Banking System

A basic web-based banking application that performs core banking operations such as creating an account, depositing funds, withdrawing money, and checking balances. Built using **Jakarta Servlets**, **JSP**, and **MySQL**.

---

## 🛠️ Technologies Used

- **Java** (JDK 17 or compatible)
- **Jakarta Servlet API**
- **JSP (JavaServer Pages)**
- **MySQL** (Database)
- **JDBC** (Database Connectivity)
- **Apache Tomcat** (Server)
- **Eclipse IDE**

---

## 📄 Features

- 🏠 **Home Page** – Navigation hub
- ➕ **Add Account** – Create a new bank account with details
- 💵 **Deposit** – Deposit money into an account
- 🏧 **Withdraw** – Withdraw funds securely
- 💰 **Check Balance** – View account balance

---

## 🗃️ Database Configuration

Make sure MySQL is installed and running.

### 1. Create the Database
```sql
CREATE DATABASE banksystem;
USE banksystem;
```
##2. Create the Table
```sql
CREATE TABLE accounts (
    account_number INT PRIMARY KEY,
    password VARCHAR(50),
    holder_name VARCHAR(100),
    balance DOUBLE
);
```
## ⚙️ Setup Instructions
* ### Step 1: Clone the Project 
```bash
git clone https://github.com/your-username/simple-banking-system.git
```
* ### Step 2: Import into Eclipse
```
Open Eclipse IDE

Go to File > Import > Existing Projects into Workspace

Select the project folder
```
* ### Step 3: Configure Build Path
```
Right-click on project > Build Path > Configure Build Path > Libraries

Add:

Apache Tomcat server runtime

MySQL JDBC driver (e.g., mysql-connector-java-x.x.x.jar)
```
* ### Step 4: Set Up MySQL Connection 
In your Java Servlet files (e.g., AddServlet.java, DepositServlet.java), ensure you have:
```java
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/banksystem", "your_username", "your_password");
```
* ### Step 5: Run on Tomcat
  Right-click the project > Run As > Run on Server
  Choose Apache Tomcat
## 📌 Notes
* Ensure your MySQL server is running before starting the application.
* For production, never store raw passwords. This project is for educational/demo purposes only.
