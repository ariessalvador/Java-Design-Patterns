package VisitorPatternLab;

public class FurnitureStore {
    public static void main(String args[]){
        ShippingInformation sofa = new Shipping("Sofa", 10.00,"Heavy Weight");
        ShippingInformation chair = new Shipping("Chair", 5.00,"Light Weight");
        ShippingInformation table = new Shipping("Table", 9.0,"Middle Weight");
        ShippingCostCalculator shippingCostCalculator = new ShippingCost();
        FurnitureDetails furnitureDetails = new Furniture();

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
