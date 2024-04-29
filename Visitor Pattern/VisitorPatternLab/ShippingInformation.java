package VisitorPatternLab;

public interface ShippingInformation {
    public void accept(ShippingCostCalculator shippingCostCalculator, double distance);
    public void accept(FurnitureDetails furnitureDetails, String furnitureType);
    public double getDistance();
    public String getFurniture();
    public String getFurnitureType();
}
