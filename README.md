# Java Learning Program

This project is a simple "Hello, World!" application designed to help beginners get started with Java. It is built using Maven, a popular build automation tool.

## Description

The program consists of a single `Main` class that prints the message "Hello, Java Learner!" to the console. The purpose of this project is to demonstrate a basic Java project structure, how to compile and run a Java program using Maven, and to provide a starting point for those new to the language.

## Prerequisites

Before you begin, ensure you have the following installed on your system:

*   **Java Development Kit (JDK)**: Version 11 or higher. You can download it from [Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use an open-source alternative like [OpenJDK](https://openjdk.java.net/).
*   **Apache Maven**: A build automation tool. You can download it from the [Maven website](https://maven.apache.org/download.cgi).

## Building the Project

To build the project, open a terminal or command prompt, navigate to the root directory of the project (where the `pom.xml` file is located), and run the following command:

```bash
mvn clean install
```

This command will compile the source code, run any tests, and package the application into a JAR file. The resulting JAR file will be located in the `target` directory.

## Running the Project

Once the project has been built, you can run it using the following command:

```bash
java -jar target/learning-java-1.0-SNAPSHOT.jar
```

You should see the following output in your console:

```
Hello, Java Learner!
```

## Learning Resources

Here are some resources to help you on your Java learning journey:

*   **Official Java Documentation**: The official documentation from Oracle is a great place to start.
    *   [The Java Tutorials](https://docs.oracle.com/javase/tutorial/)
*   **Books**:
    *   *Head First Java* by Kathy Sierra & Bert Bates
    *   *Effective Java* by Joshua Bloch
*   **Online Courses**:
    *   [Java Programming and Software Engineering Fundamentals Specialization on Coursera](https://www.coursera.org/specializations/java-programming)
    *   [freeCodeCamp.org's Java course on YouTube](https://www.youtube.com/watch?v=A74TOX803D0)

Happy coding!
