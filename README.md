# Java Semester 3 - Object Oriented Programming Laboratory

This repository contains a comprehensive collection of Java programs demonstrating Object Oriented Programming concepts, GUI development, multithreading, collections, and more.

## Table of Contents

- [Experiment 1: Prime Numbers and Fibonacci](#experiment-1-prime-numbers-and-fibonacci)
- [Experiment 2: Matrix Operations](#experiment-2-matrix-operations)
- [Experiment 3: Employee Management](#experiment-3-employee-management)
- [Experiment 4: Method and Constructor Overloading](#experiment-4-method-and-constructor-overloading)
- [Experiment 5: String Manipulation](#experiment-5-string-manipulation)
- [Experiment 6: Polymorphism with Shapes](#experiment-6-polymorphism-with-shapes)
- [Experiment 7: Inheritance and Interfaces](#experiment-7-inheritance-and-interfaces)
- [Experiment 8: Abstract Classes](#experiment-8-abstract-classes)
- [Experiment 9: User-defined Packages](#experiment-9-user-defined-packages)
- [Experiment 10: Collections Framework](#experiment-10-collections-framework)
- [Experiment 12: Multithreading](#experiment-12-multithreading)
- [Experiment 13: APMC Management System](#experiment-13-apmc-management-system)
- [Experiment 14: Book Shop Management System](#experiment-14-book-shop-management-system)

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or command line

### Compilation and Execution
```bash
# For single file programs
javac ProgramName.java
java ProgramName [arguments]

# For package programs
javac -d . org/calculator/*.java Demo.java
java Demo

# For GUI programs
javac GUIProgram.java
java GUIProgram
```

## Experiment Details

### Experiment 1: Prime Numbers and Fibonacci
**File:** `exp1.java`

**Objective:** Find prime numbers in a range and generate Fibonacci sequence.

**Features:**
- Command-line argument parsing
- Prime number detection using trial division
- Custom Fibonacci sequence generation
- Edge case handling

**Usage:**
```bash
javac exp1.java
java exp1 10 50
```

**Sample Output:**
```
Primes between 10 and 50:
11 13 17 19 23 29 31 37 41 43 47 
Smallest (a): 11
Largest  (b): 47
Count: 11
Fibonacci-like series: 11 47 58 105 163 268 431 699 1130 1829 2959
```

### Experiment 2: Matrix Operations
**File:** `MatrixSymmetry.java`

**Objective:** Check if a matrix is symmetric using BufferedReader.

**Features:**
- BufferedReader for input handling
- 2D array operations
- Matrix symmetry verification
- Input validation

**Usage:**
```bash
javac MatrixSymmetry.java
java MatrixSymmetry
```

### Experiment 3: Employee Management
**File:** `EmployeeDemo.java`

**Objective:** Demonstrate class and object concepts with employee data.

**Features:**
- Employee class with salary calculations
- Scanner input handling
- Gross salary computation (Basic + DA + HRA - Tax)
- Object-oriented design

**Usage:**
```bash
javac EmployeeDemo.java
java EmployeeDemo
```

### Experiment 4: Method and Constructor Overloading
**File:** `CarDemo.java`

**Objective:** Demonstrate overloading concepts with Car class.

**Features:**
- Multiple constructors with different parameters
- Method overloading for display functionality
- Flexible object creation

**Usage:**
```bash
javac CarDemo.java
java CarDemo
```

### Experiment 5: String Manipulation
**File:** `StringCapitalize.java`

**Objective:** Capitalize first letter of each word in a string.

**Features:**
- String processing methods
- Word splitting and manipulation
- StringBuilder for efficient string building
- Scanner input handling

**Usage:**
```bash
javac StringCapitalize.java
java StringCapitalize
```

### Experiment 6: Polymorphism with Shapes
**File:** `ShapeAreaDemo.java`

**Objective:** Calculate areas using method overloading.

**Features:**
- Overloaded area methods for different shapes
- Rectangle, square, and circle calculations
- Interactive menu system
- Switch-case implementation

**Usage:**
```bash
javac ShapeAreaDemo.java
java ShapeAreaDemo
```

### Experiment 7: Inheritance and Interfaces
**File:** `StudentDemo.java`

**Objective:** Demonstrate inheritance hierarchy and interface implementation.

**Features:**
- Class hierarchy: Student → Test → Marksheet
- Interface implementation
- Method overriding
- Super keyword usage

**Usage:**
```bash
javac StudentDemo.java
java StudentDemo
```

### Experiment 8: Abstract Classes
**File:** `ShapeDemo.java`

**Objective:** Implement abstraction using abstract classes and methods.

**Features:**
- Abstract Shape class
- Concrete implementations for Circle, Rectangle, Triangle
- Polymorphic behavior
- Area calculations with specific formulas

**Usage:**
```bash
javac ShapeDemo.java
java ShapeDemo
```

### Experiment 9: User-defined Packages
**Files:** 
- `org/calculator/Arithmetic.java`
- `org/calculator/CalcPower.java`
- `Demo.java`

**Objective:** Create and use custom packages.

**Features:**
- Package organization
- Arithmetic operations (add, subtract, multiply, divide)
- Power calculations (square, cube)
- Import statements and package compilation

**Usage:**
```bash
javac -d . org/calculator/*.java Demo.java
java Demo
```

### Experiment 10: Collections Framework
**File:** `BookInventory.java`

**Objective:** Manage book inventory using collections.

**Features:**
- ArrayList for book storage
- HashMap for ID-based lookup
- HashSet for unique authors
- Collection iteration and display

**Usage:**
```bash
javac BookInventory.java
java BookInventory
```

### Experiment 12: Multithreading
**File:** `ThreadPattern.java`

**Objective:** Display patterns using multithreading.

**Features:**
- Thread synchronization with wait/notify
- Alternating pattern printing ($#$#$#...)
- Thread coordination
- Synchronized methods

**Usage:**
```bash
javac ThreadPattern.java
java ThreadPattern
```

### Experiment 13: APMC Management System
**File:** `APMCSystem.java`

**Objective:** GUI-based system for APMC market management.

**Features:**
- Swing GUI components
- Gala owner and tenant management
- Event handling with ActionListener
- Data display in tables/text areas

**Usage:**
```bash
javac APMCSystem.java
java APMCSystem
```

### Experiment 14: Book Shop Management System
**File:** `BookShopSystem.java`

**Objective:** Automated shop management with GUI.

**Features:**
- Tabbed interface for different operations
- Book inventory management
- Sales tracking by category
- JTabbedPane and complex GUI layout

**Usage:**
```bash
javac BookShopSystem.java
java BookShopSystem
```

## Key Concepts Demonstrated

### Object-Oriented Programming
- **Encapsulation:** Data hiding with private fields and public methods
- **Inheritance:** Class hierarchies and code reuse
- **Polymorphism:** Method overloading and overriding
- **Abstraction:** Abstract classes and interfaces

### Java Features
- **Collections Framework:** ArrayList, HashMap, HashSet
- **Exception Handling:** Try-catch blocks and custom exceptions
- **Multithreading:** Thread creation, synchronization, wait/notify
- **GUI Development:** Swing components, event handling
- **Package Management:** Creating and importing custom packages

### Design Patterns
- **MVC Pattern:** Separation of data, view, and control logic
- **Observer Pattern:** Event handling in GUI applications
- **Template Method:** Abstract classes with concrete implementations

## Project Statistics

- **Total Programs:** 13+ Java files
- **Lines of Code:** 2000+ lines
- **Concepts Covered:** 25+ OOP and Java concepts
- **GUI Applications:** 2 complete systems
- **Package Structure:** Organized with proper namespacing

## Contributing

This is an educational project for Java OOP concepts. Feel free to:
- Add more examples or improvements
- Fix bugs or optimize code
- Add documentation or comments
- Create additional test cases

## License

This project is created for educational purposes. Feel free to use and modify for learning.

## Author

**Hamza Memon**  
Portfolio: [hamzamemon.me](https://hamzamemon.me)

Created as part of Java Semester 3 coursework demonstrating comprehensive Object-Oriented Programming concepts and practical applications.

---

**Note:** All programs include comprehensive error handling, input validation, and follow Java coding best practices. The GUI applications require a display environment to run properly.