# CMP269 Assignment 1

This repository contains two Java programming exercises demonstrating object-oriented programming concepts.

## Project Structure

```
├── src/
│   ├── exercise1/          # Payment system exercise
│   │   ├── App.java
│   │   ├── Payable.java
│   │   ├── PaymentMethod.java
│   │   ├── CreditCard.java
│   │   └── MealPlan.java
│   └── exercise2/          # Smart home devices exercise
│       ├── AppExercise2.java
│       ├── Powerable.java
│       ├── Adjustable.java
│       ├── SmartDevice.java
│       ├── SmartLight.java
│       └── SmartThermostat.java
├── bin/                    # Compiled class files (excluded from git)
└── LICENSE
```

## Exercise 1: Payment System

Demonstrates interfaces and abstract classes with a payment processing system.

**Compile:**
```bash
javac -d bin src/exercise1/*.java
```

**Run:**
```bash
java -cp bin exercise1.App
```

## Exercise 2: Smart Home Devices

Demonstrates multiple interfaces and inheritance with smart home devices.

**Compile:**
```bash
javac -d bin src/exercise2/*.java
```

**Run:**
```bash
java -cp bin exercise2.AppExercise2
```

## Compile and Run All

```bash
# Compile all exercises
javac -d bin src/exercise1/*.java
javac -d bin src/exercise2/*.java

# Run Exercise 1
java -cp bin exercise1.App

# Run Exercise 2
java -cp bin exercise2.AppExercise2
```

## License

This project is licensed under the MIT License - see the LICENSE file for details.
