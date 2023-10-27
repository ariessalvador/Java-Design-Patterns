package FacadePattern;

public class Cart implements HotelService{
    @Override
    public void performService(String numberOfCarts) {
        int cartCount = Integer.parseInt(numberOfCarts);
        System.out.println(requestCart(cartCount));
    }
    public String requestCart(int numberOfCarts) {
        if (numberOfCarts == 1) {
            return "You have requested 1 luggage cart.";
        } else {
            return "You have requested " + numberOfCarts + " luggage carts.";
        }
    }
}
