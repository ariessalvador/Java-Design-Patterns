package VisitorPatternLab;

import java.util.*;

public class ShippingCost implements ShippingCostCalculator{
    @Override
    public double calculateShippingCost(String furniture, double distance) {
        switch(furniture){
            case "Chair":
                return 10.00; // Flat shipping rate for chairs
            case "Table":
                return 30.0 + (0.5 * distance); // Base cost + cost per kilometer
            case "Sofa":
                return 50.0 + (0.5 * distance); // Base cost + cost per kilometer
            default:
                System.out.print("Unknown furniture");
        }
        return 0;
    }
}
