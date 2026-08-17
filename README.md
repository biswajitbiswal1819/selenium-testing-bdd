# Selenium Testing - BDD Cucumber

This repository contains a Selenium + Cucumber + TestNG BDD framework for automated testing.

## Overview
- **Framework**: BDD Cucumber with Selenium WebDriver
- **Language**: Java 17
- **Build Tool**: Maven
- **Test Framework**: TestNG
- **Browser Automation**: Selenium 4
- **Driver Management**: WebDriverManager

## Project Structure

```
src/
├── main/java/
│   ├── base/
│   │   └── BaseTest.java              # Base class for test setup/teardown
│   ├── pages/
│   │   └── WebForm.java               # Page Object Model for Web Form
│   ├── stepDefinitions/
│   │   ├── WebFormSteps.java          # Step definitions for web form tests
│   │   └── Hooks.java                 # Cucumber hooks for setup/teardown
│   └── utils/
│       └── ScreenshotUtil.java        # Utility for taking screenshots
├── test/resources/features/
│   └── WebForm.feature                # Cucumber feature files
└── test/java/
    └── runners/
        └── TestRunner.java            # Cucumber test runner
```

## Prerequisites
- Java 17 (or newer) installed and JAVA_HOME set
- Maven installed
- Chrome browser installed

## Running Tests

### Run all tests
```bash
mvn test
```

### Run specific feature
```bash
mvn test -Dcucumber.features=src/test/resources/features/WebForm.feature
```

### Run with specific tags
```bash
mvn test -Dcucumber.options="--tags @smoke"
```

## Features
- ✅ Page Object Model (POM) design pattern
- ✅ Cucumber feature files for BDD
- ✅ Step definitions with Gherkin syntax
- ✅ Hooks for setup and teardown
- ✅ Screenshot utility
- ✅ WebDriverManager for automatic driver management
- ✅ Explicit waits
- ✅ Cross-browser support

## Test Scenarios

### Web Form Submission
- Filling text input
- Entering password
- Entering text area
- Selecting dropdown options
- Selecting checkboxes
- Selecting radio buttons
- Form submission
- Validating success message

## Dependencies
- Selenium 4.46.0
- Cucumber Java 7.14.0
- Cucumber TestNG 7.14.0
- TestNG 7.9.0
- WebDriverManager 5.6.3
- Apache POI 5.2.5

## Author
Biswajit Biswal

## License
MIT