package FacadePattern;
public class FrontDesk {
    //facade
    private HotelService hotelService;
    public FrontDesk (HotelService hotelService){
        this.hotelService = hotelService;
    }
    public void performService(String data){
        hotelService.performService(data);
    }
}
