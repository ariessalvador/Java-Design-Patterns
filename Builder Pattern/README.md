# E-Commerce User Class with Builder Pattern

## Overview

In our e-commerce application, customers encounter challenges when creating accounts due to the limitations of the standard constructor for the User class. These challenges include difficulties with registration forms, mandatory input for optional fields, and potential data consistency problems.

To address these issues, we have implemented the Builder Pattern for the User class. This pattern provides a more flexible and user-friendly way of creating User objects, alleviating the constraints of the standard constructor.

## User Class Definition

### User

The `User` class now utilizes the Builder Pattern to accommodate varying levels of detail in user profiles. It includes the following features:

- **Required Fields:**
  - firstName
  - lastName
  - email

- **Optional Fields:**
  - address
  - phone
  - age

## Builder Pattern Implementation

### UserBuilder

The `UserBuilder` class serves as the builder for the User class. It provides methods to set optional fields, allowing users to create User objects without being constrained by the order of parameters or the need to provide complete information.
### Class Diagram
![image](https://github.com/ariessalvador/Software-Engineering-Projects/assets/142958841/e2948814-5941-4fd5-821d-6b3b6339f3ab)


### Example Usage

```java
User user = new User.UserBuilder()
                .firstName("John")
                .lastName("Doe")
                .email("john.doe@example.com")
                .address("123 Main St")
                .phone("123-456-7890")
                .age(30)
                .build();
