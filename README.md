# Ensuring User Input Matches: A Custom Exception Approach

Welcome to the **Ensuring User Input Matches: A Custom Exception Approach** repository! This project demonstrates how to create and use a custom exception in Java to handle user input validation. Specifically, it checks whether the user-entered string matches a predefined string (`"India"`) and throws a custom exception if it does not.

## Table of Contents
- Overview
- How It Works
- Project Structure
- Prerequisites
- Usage
- Contributing
- License

---

## Overview

This repository contains two Java files:

1. **Main.java**:
   - Prompts the user for a string.
   - Checks if the entered string matches `"India"`.
   - Throws a custom exception (`NOMATCHEXCP`) if it does not match.
   - If it matches, it displays a success message.

2. **NOMATCHEXCP.java** (the custom exception class):
   - Extends the `Exception` class.
   - Captures the error message, the input string that caused the error, and the line number where the mismatch was detected.
   - Overrides the `toString()` method to provide a detailed error message.

This simple example illustrates how custom exceptions can help you maintain clear, descriptive error-handling mechanisms in Java applications.

---

## How It Works

1. The program starts by reading user input from the console using a `Scanner`.
2. The input is then compared to the string `"India"`.
3. If the input does not match:
   - A `NOMATCHEXCP` is thrown with a descriptive message, the erroneous string, and the line number.
4. If the input matches:
   - A success message is displayed.

By creating a custom exception, developers can provide more specific debugging information than what is typically offered by standard Java exceptions.

---

## Project Structure

```
.
├── Main.java
└── NOMATCHEXCP.java
```

- **Main.java** contains the `main()` method where the user input is taken and validated.
- **NOMATCHEXCP.java** defines the custom exception class.

---

## Prerequisites

- **Java Development Kit (JDK)** installed (version 8 or later).
- A terminal or IDE (such as Eclipse, IntelliJ, or VS Code) to compile and run the code.

---

## Usage

1. **Clone the repository**:
   ```
   git clone https://github.com/your-username/Ensuring-User-Input-Matches-A-Custom-Exception-Approach.git
   ```
2. **Navigate to the project directory**:
   ```
   cd Ensuring-User-Input-Matches-A-Custom-Exception-Approach
   ```
3. **Compile the Java files**:
   ```
   javac Main.java NOMATCHEXCP.java
   ```
4. **Run the program**:
   ```
   java Main
   ```
5. **Enter your input** when prompted:
   - If you type `India`, you will see:
     ```
     Entered string matches 'India'.
     ```
   - If you type anything else, for example `Hello`:
     ```
     NOMATCHEXCP at line XX: String does not match 'India' - Erroneous string: Hello
     ```

---

## Contributing

Contributions are welcome! If you have any suggestions or improvements:
1. Fork the repository
2. Create a new branch (`git checkout -b feature-new`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature-new`)
5. Open a Pull Request

---

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute this project as you see fit.

---

Thank you for checking out this repository! If you find it helpful, feel free to give it a star and share it with others who might benefit from learning about custom exceptions in Java.
