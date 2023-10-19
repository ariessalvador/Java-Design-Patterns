import java.util.Scanner;

public class PowerOutletManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Power Outlet Manager Menu:");
            System.out.println("1. Plug in a Laptop");
            System.out.println("2. Plug in a Refrigerator");
            System.out.println("3. Plug in a Smartphone Charger");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Plug in a Laptop
                    Laptop laptop = new Laptop();
                    PowerOutlet laptopPower = new LaptopAdapter(laptop);
                    System.out.println(laptopPower.plugIn() + "\n");
                    break;

                case 2:
                    // Plug in a Refrigerator
                    Refrigerator refrigerator = new Refrigerator();
                    PowerOutlet refPower = new RefrigeratorAdapter(refrigerator);
                    System.out.println(refPower.plugIn() + "\n");
                    break;

                case 3:
                    // Plug in a Smartphone Charger
                    SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
                    PowerOutlet smartPhonePower = new SmartphoneAdapter(smartphoneCharger);
                    System.out.println(smartPhonePower.plugIn() + "\n");
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting Power Outlet Manager.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}