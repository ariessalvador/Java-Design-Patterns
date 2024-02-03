package BuilderPattern_Lab1;

import java.util.Scanner;

public class UserApp {
    private static int userIdCounter = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Register a new user");
            System.out.println("2. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Registering a new user...");
                    User newUser = getUserInformation(scanner);
                    System.out.println("User registered successfully:");
                    displayUserInfo(newUser);
                    userIdCounter++;
                    break;
                case 2:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static User getUserInformation(Scanner scanner) {
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter email:");
        String email = scanner.nextLine();

        System.out.println("Enter address:");
        String address = scanner.nextLine();

        System.out.println("Enter phone:");
        String phone = scanner.nextLine();

        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        return new User.UserBuilder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .address(address)
                .phone(phone)
                .Age(age)
                .build();
    }

    private static void displayUserInfo(User user) {
        System.out.println("User ID: " + userIdCounter);
        System.out.println("First Name: " + user.firstName);
        System.out.println("Last Name: " + user.lastName);
        System.out.println("Email: " + user.email);
        System.out.println("Address: " + user.address);
        System.out.println("Phone: " + user.phone);
        System.out.println("Age: " + user.age);
    }
}
