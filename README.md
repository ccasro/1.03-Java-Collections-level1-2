# 1.03-Java-Collections-level1-2

## 📄 Description

- **Level1/E1** – Create a Month class, fill an ArrayList with months (except August), insert August in the 
    correct position, convert the list to a HashSet and iterate it.

- **Level1/E2** – Create a List<Integer>, then a second list with the elements of the first in reverse 
    using ListIterator.

- **Level1/E3** – Read countries.txt into a HashMap<String, String>, ask the user for their name, quiz them on capitals 
    (10 random countries), and save their score in classification.txt.

- **Level2/E1** – Create a Restaurant class with name and score. Ensure a HashSet does not allow duplicates with the 
    same name and score.

- **Level2/E2** – Sort Restaurant objects by name and score (descending).


## 💻 Technologies used

- Java 23
- IntelliJ IDEA
- Maven 3.9+ (IntelliJ IDEA bundled Maven)

## 📋 Requirements

- Java 17 or higher
- Maven installed (bundled with IntelliJ is enough)
- IDE capable of running Java projects (e.g., IntelliJ IDEA, Eclipse)

## 🛠️ Installation

1. Clone the repository:

```bash
git clone https://github.com/ccasro/1.02-Exceptions-Level1-2.git
```

2. Open the project in your IDE (e.g., IntelliJ IDEA)
3. Ensure Maven dependencies are downloaded automatically

## ▶️ Execution

This repository contains multiple exercises (5). To run a specific exercise, execute the corresponding **'main'** class.
To run Level1/Exercise 3 you must use Maven so that the resources are properly included in the classpath:

```bash
mvn clean compile
```
```bash
mvn exec.java -Dexec.mainClass=org.ccasro.level1.exercise3.MainL1E3
```

## 🌐 Deployment

No production deployment is required for this exercise

## 🤝 Contributions

- Use the main branch for development.
- Make small, frequent commits following Conventional Commits.
- Do not add compiled files or credentials to the repository.
- To propose improvements, create a branch and open a pull request.
