package FacadePattern;

public class HouseKeeping implements HotelService {
    @Override
    public void performService(String roomNumber) {
        System.out.println(cleanRoom(roomNumber));
    }
    public String cleanRoom(String roomNumber) {
        return "Room " + roomNumber + " has been cleaned and is now immaculate for your comfort.";
    }
}
