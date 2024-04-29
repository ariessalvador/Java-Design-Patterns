
# Furniture Shipping Calculator using Visitor Design Pattern

## Overview

In this project, we implement a furniture shipping cost calculator using the Visitor design pattern. The system calculates shipping costs based on the type and size of the furniture being shipped. Each furniture type may have its own unique shipping cost calculation logic.

## Problem Scenario

You are a software developer working on an e-commerce platform that sells various types of furniture (chairs, tables, sofas, etc.). You want to implement a functionality that calculates the shipping cost based on the furniture type and size.

Each furniture type might have its own unique shipping cost calculation logic. For example, chairs might be lightweight and have a flat shipping rate, while sofas might be bulky and require a distance-based shipping cost calculation. Implementing separate shipping logic within each furniture class would lead to tight coupling and difficulty adding new furniture types in the future.

## Solution Approach

We use the Visitor design pattern to separate the shipping cost calculation logic from the furniture classes. This allows us to add new types of furniture and their corresponding shipping cost calculation methods without modifying existing code.

## UML Class Diagram
![visitorpatternUML](https://github.com/ariessalvador/Software-Engineering-Projects/assets/142958841/e5ba1e3f-5315-4784-b123-1798b6ef98d8)


## Implementation Details

- **`FurnitureDetails` interface**: Defines a method to display shipping details for each furniture type.
- **`Furniture` class**: Implements the `FurnitureDetails` interface to display shipping details for different furniture types.
- **`ShippingInformation` interface**: Defines methods to accept visitors for shipping cost calculation and to retrieve furniture details.
- **`Shipping` class**: Implements the `ShippingInformation` interface to store furniture details and accept visitors for shipping cost calculation.
- **`ShippingCostCalculator` interface**: Defines a method to calculate shipping costs based on furniture type and distance.
- **`ShippingCost` class**: Implements the `ShippingCostCalculator` interface to calculate shipping costs based on the type and distance of the furniture.

## Example Usage

```java
public class FurnitureStore {
    public static void main(String args[]){
        // Create furniture objects
        ShippingInformation sofa = new Shipping("Sofa", 10.00, "Heavy Weight");
        ShippingInformation chair = new Shipping("Chair", 5.00, "Light Weight");
        ShippingInformation table = new Shipping("Table", 9.0, "Middle Weight");
        
        // Create shipping cost calculator
        ShippingCostCalculator shippingCostCalculator = new ShippingCost();
        FurnitureDetails furnitureDetails = new Furniture();
        
        // Display shipping details and calculate shipping cost for each furniture
        System.out.println("==== Chair ====");
        chair.accept(furnitureDetails, chair.getFurnitureType());
        System.out.println("Distance: " + chair.getDistance() + " km");
        System.out.print("Shipping Cost: $");
        chair.accept(shippingCostCalculator, chair.getDistance());

        System.out.println("\n\n==== Table ====");
        table.accept(furnitureDetails, table.getFurnitureType());
        System.out.println("Distance: " + table.getDistance() + " km");
        System.out.print("Shipping Cost: $");
        table.accept(shippingCostCalculator, table.getDistance());

        System.out.println("\n\n==== Sofa ====");
        sofa.accept(furnitureDetails, sofa.getFurnitureType());
        System.out.println("Distance: " + sofa.getDistance() + " km");
        System.out.print("Shipping Cost: $");
        sofa.accept(shippingCostCalculator, sofa.getDistance());
    }
}

