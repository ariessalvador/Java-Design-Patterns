package SolidPrinciple;

public class TotalCalculation implements TotalCalculator {
    @Override
    public double calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
        return total;
    }
}
