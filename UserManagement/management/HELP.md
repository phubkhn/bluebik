# Running Spring Boot Projects with gRPC

## User Management Project

### Requirements:

- Java JDK 17 or later
- Maven
- MySQL 

### Setup:


0. **Prepare Database:**

   Check Connection and modify application.properties
      ```
      spring.datasource.url=jdbc:mysql://localhost:3306/bluebik
      spring.datasource.username=root
      spring.datasource.password=root
      ```

   Create schema query: 
      ```
      CREATE SCHEMA `bluebik` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
      ```

1. **Clone the Project from the Repository:**

   ```bash
   git clone https://github.com/phubkhn/bluebik.git

2. **Navigate to the Project Directory:**

   ```bash
   cd bluebik/UserManagement/management
3. **Run the Project using Maven:**

    ```bash
    mvn spring-boot:run

The User Management will run on http://localhost:8000.

