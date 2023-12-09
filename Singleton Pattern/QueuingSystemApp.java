import java.util.Scanner;

public class QueuingSystemApp {
    public static void main(String[] args) {
        CentralizedQueueSystem centralizedQueueSystem = CentralizedQueueSystem.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Centralized Queuing System for Pag-ibig Office");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Get Current Queue Numbers");
            System.out.println("2. Set Queue Number");
            System.out.println("3. Reset Queue Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    centralizedQueueSystem.getCurrentQueueNumber();
                    break;
                case 2:
                    System.out.print("Enter Help Desk Number (1 for A, 2 for B, 3 for C): ");
                    int helpDeskNum = scanner.nextInt();
                    centralizedQueueSystem.setQueueNumber(helpDeskNum);
                    break;
                case 3:
                    System.out.print("Enter Help Desk Number to reset (1 for A, 2 for B, 3 for C): ");
                    int resetHelpDeskNum = scanner.nextInt();
                    System.out.print("Enter new Queue Number: ");
                    int newQueueNumber = scanner.nextInt();
                    centralizedQueueSystem.resetQueueNumber(resetHelpDeskNum, newQueueNumber);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
