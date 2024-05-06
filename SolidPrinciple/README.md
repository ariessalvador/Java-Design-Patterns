# Implementing SOLID Principles in Object-Oriented Programming

## Overview

In this project, we have improved the provided code to adhere to the SOLID principles in object-oriented programming. The SOLID principles are a set of guidelines that aim to make software designs more understandable, flexible, and maintainable.

### Task

The task was to refactor the given code to implement SOLID principles. The initial code provided an `Order` interface with methods for calculating total, placing an order, generating an invoice, and sending an email notification. The objective was to improve the code to better align with SOLID principles.

### Original Code
```java
public interface Order {
    void calculateTotal(double price, int quantity);
    void placeOrder(String customerName, String address);
    void generateInvoice(String fileName);
    void sendEmailNotification(String email);
}

public class OrderAction implements Order {
    @Override
    public void calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }

    @Override
    public void placeOrder(String customerName, String address) {
        // Simulate placing order in a system
        System.out.println("Order placed for " + customerName + " at " +
                address);
    }

    @Override
    public void generateInvoice(String fileName) {
        // Simulate generating invoice file
        System.out.println("Invoice generated: " + fileName);
    }

    @Override
    public void sendEmailNotification(String email) {
        // Simulate sending email notification
        System.out.println("Email notification sent to: " + email);
    }
}

public class OrderTest {
    public static void main(String[] args) {
        Order order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");
        // These methods might not be needed for all orders
        order.generateInvoice("order_123.pdf");
        order.sendEmailNotification("johndoe@example.com");
    }
}
```
### Solution Approach

To implement SOLID principles, we focused on refactoring the code to adhere to the following principles:

1. **Single Responsibility Principle (SRP)**
2. **Open/Closed Principle (OCP)**
3. **Liskov Substitution Principle (LSP)**
4. **Interface Segregation Principle (ISP)**
5. **Dependency Inversion Principle (DIP)**

### Improved Code

We split the responsibilities of the original `Order` interface into separate interfaces, each focusing on a single responsibility:
- `TotalCalculator`: Calculates the total price of an order.
- `OrderPlacer`: Places an order for a customer.
- `InvoiceGenerator`: Generates an invoice for the order.
- `EmailNotifier`: Sends an email notification to the customer.


### UML Diagram
![solid](https://github.com/ariessalvador/Software-Engineering-Projects/assets/142958841/6fb0ec52-9008-412f-affe-3b19db71b31b)


