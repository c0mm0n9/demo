# CRUD Customer API
## To run with Maven:

1. **Install JDK 22 and Maven:**
   - Install JDK 22 from [Oracle's website](https://www.oracle.com/cis/java/technologies/downloads/).
   - Install Maven from [here](https://maven.apache.org/download.cgi).

2. **Install and Set Up MySQL:**
   - Install MySQL from [MySQL's official website](https://dev.mysql.com/downloads/).
   - Create a database named `test`:
     ```sql
     CREATE DATABASE test;
     ```

3. **Clone the Repository:**
   - Clone the repository to your local machine:
     ```bash
     git clone https://github.com/c0mm0n9/demo/
     ```

4. **Navigate to Project Directory:**
   - Open a terminal and navigate to the project directory:
     ```bash
     cd demo
     ```

5. **Restore the Database:**
   - Navigate to the `database` directory in the project.
   - Restore the database using the dump.sql file:
     ```bash
     mysql -u <username> -p test < dump.sql
     ```
   Replace `<username>` with your MySQL username.

6. **Change Database Access Credentials**
    - Locate the application.properties File

    - Navigate to the src/main/resources/ directory.
    - Open the application.properties file.
    - Find the Database Configuration Section

    - Look for the following properties in the file:

    - properties
    ```
    spring.datasource.url=jdbc:mysql://localhost:3306/test
    spring.datasource.username=
    spring.datasource.password=
    ```
    - Modify the Username and Password

    Change username and password to the actual username and password for your database.

    For example:

    ```
    spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
    spring.datasource.username=myuser
    spring.datasource.password=mypassword
    ```
    - Save the Changes

    After updating the application.properties file with the correct username and password, save the file.

7. **Run the Project:**
   - Build the project using Maven:
     ```bash
     mvn clean install
     ```
   - Run the project using the Maven Spring Boot plugin:
     ```bash
     mvn spring-boot:run
     ```

8. **Access the Application:**
   - API is running on the following address:
     ```
     http://localhost:8080/
     ```

