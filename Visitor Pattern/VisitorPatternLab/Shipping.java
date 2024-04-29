package VisitorPatternLab;

public class Shipping implements ShippingInformation{
    private String furniture;
    private double distance;
    private String furnitureType;

    public Shipping(String furniture, double distance, String furnitureType){
        this.furniture = furniture;
        this.distance = distance;
        this.furnitureType = furnitureType;
    }


    @Override
    public void accept(ShippingCostCalculator shippingCostCalculator, double distance) {
        System.out.print((shippingCostCalculator.calculateShippingCost(furniture,distance)));
    }

    @Override
    public void accept(FurnitureDetails furnitureDetails, String furnitureType) {
        furnitureDetails.showFurnitureShippingDetails(furnitureType);
    }

    @Override
    public double getDistance() {
        return distance;
    }

    @Override
    public String getFurniture() {
        return furniture;
    }

    @Override
    public String getFurnitureType() {
        return furnitureType;
    }
}
