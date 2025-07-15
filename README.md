Hostel Booking System
________________________________________________
👥 Group Members

1.Vaibhav Davale
2.Ajay Mali

📝 Project

Hostel Booking System

⚡ Technologies Used

JAVA JDK 23.0.1

Apache Maven 3.9.10

PostgreSQL 17.5

Hibernate-JPA



________________________________________________

📑Introduction

The Hostel Booking System is a Java-based console application developed to automate and simplify the process of hostel room booking and student record management. This system enables users to input student details, allocate rooms dynamically based on availability, and generate booking confirmations.

One of the key features of this system is its integration with a database using JPA and Hibernate, allowing for efficient storage and retrieval of student records and booking history. This ensures data consistency, easy access to historical information, and better management of hostel room allocations.

Designed for university hostel management or educational demonstration purposes, the system aims to reduce manual work, minimize allocation errors, and offer a user-friendly menu-driven interface for handling hostel booking tasks.

________________________________________________

📋About

The Hostel Booking System is a Java console application designed to streamline hostel room booking and student management. It allows users to input student details, allocate available rooms, update bookings, and display payment or booking confirmation information. The system also stores data in a PostgreSQL database using JPA for persistent storage and retrieval.

This project helps automate hostel booking processes and maintain organized records for hostel management teams or simulation-based learning.

----------------------------------------------------------------------------


✅Features

✔ Simple Java console application with dynamic user inputs
✔ Menu-driven interface with clear booking and viewing options
✔ Takes student details, room preferences, and booking dates
✔ Allocates rooms dynamically based on current availability
✔ Displays booking confirmation and room details to the user
✔ Stores all booking data persistently in the database using JPA and Hibernate
✔ Allows viewing of all stored records for management reviews
✔ Modular design with clear separation of DAO, model, and service layers
----------------------------------------------------------------------------

📂   Project-Structure

📁 hostel-booking-system
│
├── 📁 src
│   ├── 📁 main
│   │   ├── 📁 java
│   │   │   └── 📁 org
│   │   │       └── 📁 hostelbooking
│   │   │           ├── 📁 dao
│   │   │           │   ├── BookingDao.java
│   │   │           │   └── StudentDao.java
│   │   │           ├── 📁 model
│   │   │           │   ├── Booking.java
│   │   │           │   └── Student.java
│   │   │           ├── 📁 util
│   │   │           │   └── JPAUtil.java
│   │   │           ├── Main.java
│   └── 📁 test
│       └── 📁 java
│           └── 📁 org
│               └── 📁 hostelbooking
│                   └── AppTest.java
│
├── 📁 target
│   ├── compiled classes and test-classes...
│
├── 🌐 pom.xml


________________________________________________

⚙ Installation

# Clone the repository
git clone https://github.com/VaibhaDavale/hostel-booking-system

# Navigate into the directory
cd hostel-booking-system

# Install dependencies via Maven
mvn clean install


________________________________________________

🔧Dependencies-Used

<dependencies>
    <!-- JDBC Dependency for PostgreSQL -->
    <dependency>
      <groupId>org.postgresql</groupId>
      <artifactId>postgresql</artifactId>
      <version>42.7.3</version>
    </dependency>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

________________________________________________

 🗃 Usage

Once the project is installed and compiled, you can run the application and interact with it through the console.

Steps to Use:

1. Launch the application:
java -cp target/classes org.hostelbooking.Main

2. Follow on-screen prompts:

Enter student details (Name, Roll Number, Room Preferences, Booking Dates, etc.)

System will allocate an available room dynamically

Displays booking confirmation and payment (if implemented)


3. Database operations:

Student and booking information is stored in the connected PostgreSQL database using JPA

You can view stored records via in-app options or by querying the database


________________________________________________

🚀 How to Run?

1.Clone this repository

2.Ensure your PostgreSQL database 
hibernate_crud is up and running with the required tables

3.Configure your database connection in hibernate.cfg.xml

4.Use Maven to build the project

5.Run the 'Main.java' class from your IDE or command line
________________________________________________
*Prerequisites
-Java JDK 17 or later
-PostgreSQL or any supported relational database
-A Java IDE (e.g., IntelliJ IDEA, Eclipse, VS Code)
-Apache Maven installed from here -->https://maven.apache.org/download.cgi



________________________________________________

🧑‍💻 Group member

Made with 💡 by

1.Vaibhav Davale
 2.Ajay Mali

📧 davlevaibhav0@gmail.com
📧 ajaymali0885@gmail.com 
📍 India
