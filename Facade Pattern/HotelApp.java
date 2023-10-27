package FacadePattern;

import java.util.Scanner;

public class HotelApp {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        while (true) {
            System.out.println("Welcome to the Simplified Hotel Management System!");
            System.out.println("Please select a hotel service:");
            System.out.println("1. Valet Parking");
            System.out.println("2. Housekeeping");
            System.out.println("3. Luggage Carts");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    // Valet Parking
                    System.out.print("Enter your vehicle's plate number: ");
                    String plateNumber = sc.nextLine();
                    HotelService valetService = new Valet();
                    FrontDesk valetFrontDesk = new FrontDesk(valetService);
                    valetFrontDesk.performService(plateNumber);
                    break;
                case 2:
                    // Housekeeping
                    System.out.print("Enter your room number: ");
                    String roomNumber = sc.nextLine();
                    HotelService houseKeepingService = new HouseKeeping();
                    FrontDesk houseKeepingFrontDesk = new FrontDesk(houseKeepingService);
                    houseKeepingFrontDesk.performService(roomNumber);
                    break;
                case 3:
                    // Luggage Carts
                    System.out.print("Enter the number of carts you need: ");
                    String numberOfCarts = sc.nextLine();
                    HotelService cartService = new Cart();
                    FrontDesk cartFrontDesk = new FrontDesk(cartService);
                    cartFrontDesk.performService(numberOfCarts);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Thank you for using the Simplified Hotel Management System. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
