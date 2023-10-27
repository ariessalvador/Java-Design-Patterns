package FacadePattern;

public class Valet implements HotelService{
    @Override
    public void performService(String plateNumber) {
        System.out.println(pickUpVehicle(plateNumber));
    }
    public String pickUpVehicle(String plateNumber) {
        return "Your vehicle with plate number " + plateNumber + " has been parked and is now ready for pickup.";
    }
}
