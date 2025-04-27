# Age Calculator

A simple Java application that calculates age based on date of birth.

## Features

- Takes date of birth as input in DD/MM/YYYY format
- Calculates exact age in years, months, and days
- Input validation for date format
- Error handling for invalid inputs

## Prerequisites

- Java JDK 22 or higher
- Maven 3.8 or higher

## Building the Project

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd age-calculator
   ```

2. Build the project:
   ```bash
   mvn clean compile
   ```

3. Run the application:
   ```bash
   mvn exec:java -Dexec.mainClass="AgeCalculator"
   ```

## CI/CD

This project uses GitHub Actions for continuous integration. The workflow:
- Runs on every push to main branch
- Runs on pull requests
- Builds the project
- Runs tests
- Uses JDK 22

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request 