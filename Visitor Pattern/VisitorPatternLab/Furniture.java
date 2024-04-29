package VisitorPatternLab;

public class Furniture implements FurnitureDetails{
    @Override
    public void showFurnitureShippingDetails(String furnitureType) {
        switch (furnitureType) {
            case "Light Weight":
                System.out.println("You ordered a light-weight furniture. This will not require special handling and has a flat rate shipping cost.");
                break;
            case "Middle Weight":
                System.out.println("You ordered a middle-weight furniture. It may require additional packaging and has a moderate shipping cost.");
                break;
            case "Heavy Weight":
                System.out.println("You ordered a heavy-weight furniture. It requires special handling due to its weight and size, resulting in a higher shipping cost.");
                break;
            default:
                System.out.println("Unknown furniture type");
        }
    }
}
