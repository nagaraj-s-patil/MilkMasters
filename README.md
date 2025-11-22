

# **MilkMasters 🥛 – Java Full Stack Dairy Product Management App**

MilkMasters is a **Java Full Stack web application** built using **JSP, Servlets, JDBC, MySQL, HTML, CSS, JS**.
It allows users to browse dairy products by brand and supports user registration/login.

---

## 🚀 **Features**

### **User**

* Registration (JSP + Servlet)
* Login authentication
* Basic session handling

### **Product**

* Brand-wise pages:

  * Amul
  * Gokul
  * Mother Dairy
  * Nandini
* Product images, details, and pricing
* Organized UI under `/web/`

### **Backend**

* JDBC-based DB connection
* MySQL table for users
* Servlet business logic
* JSP view rendering

---

## 🛠️ **Tech Stack**

| Layer      | Technology            |
| ---------- | --------------------- |
| Frontend   | HTML, CSS, JavaScript |
| Backend    | Java (Servlet + JSP)  |
| Database   | MySQL                 |
| Build Tool | NetBeans (Ant)        |
| Server     | GlassFish / Tomcat    |
| Libraries  | `mysql-connector.jar` |

---

## 📂 **Project Structure (Cleaned)**

```
MilkMasters
│── src/                     # Java source files
│── web/                     # JSP, HTML, images, WEB-INF
│   └── WEB-INF/web.xml
│── nbproject/
│   ├── project.properties
│   └── project.xml
│── build.xml                # NetBeans Ant build
└── README.md
```

---

## 🗄️ **Database Setup**

### **Table: users**

```sql
CREATE TABLE users (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50),
  email VARCHAR(100),
  password VARCHAR(100)
);
```

### JDBC Connection Example

```java
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection(
  "jdbc:mysql://localhost:3306/milkmaster", "root", "password"
);
```

---

## ⚙️ **How to Run the Project**

### **1. Clone the repository**

```
git clone https://github.com/nagaraj-s-patil/MilkMasters.git
```

### **2. Open in NetBeans**

### **3. Add MySQL connector**

Place the JAR inside:

```
web/WEB-INF/lib/
```

### **4. Configure MySQL database**

### **5. Run on GlassFish or Tomcat**

---

## 🎯 **Possible Future Enhancements**

* Admin dashboard
* Dynamic product storage in DB (instead of static HTML)
* Cart + ordering
* Spring Boot migration
* JWT authentication

---

## 👤 **Author**

**Nagaraj S Patil**
Java Full Stack Developer

---
