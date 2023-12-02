import java.util.Scanner;

public class NewsService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NewsAgency newsAgency = new NewsAgency();

        newsAgency.setLocalNews("Typhoon Warning Issued as a Powerful Storm Approaches the Philippines");
        newsAgency.setGlobalNews("Scientists Warn of Escalating Global Warming Crisis");
        newsAgency.setFinancialNews("Philippine Stock Market Surges to Record High Amid Positive Economic Outlook");
        newsAgency.setFlashNews("A Major Scientific Discovery Unveiled: Researchers Confirm Existence of Water on Mars!");

        Subscriber user1 = createUser("LeBron James ", sc);
        newsAgency.subscribe(user1);
        newsAgency.publishNews();

        System.out.println("Adding new user..... \n");
        Subscriber user2 = createUser("Anthony Davis", sc);
        newsAgency.subscribe(user2);
        newsAgency.setFlashNews("Global Efforts Succeed in Halting Deforestation, Promoting Reforestation");
        newsAgency.publishNews();

        System.out.println("Unsubscribing a user(LeBron James)....");
        newsAgency.unsubscribe(user1);
        newsAgency.setFlashNews("Global Markets React Positively to Sustainable Energy Initiatives");
        newsAgency.publishNews();
    }
    private static Subscriber createUser(String username, Scanner sc) {
        Subscriber user = new Subscriber();
        user.setName(username);

        System.out.println(username + ", do you want to subscribe to Local News? (yes/no): ");
        String localNewsChoice = sc.nextLine().toLowerCase();
        user.setSubscribedToLocalNews(localNewsChoice.equals("yes"));

        System.out.println(username + ", do you want to subscribe to Global News? (yes/no): ");
        String globalNewsChoice = sc.nextLine().toLowerCase();
        user.setSubscribedToGlobalNews(globalNewsChoice.equals("yes"));

        System.out.println(username + ", do you want to subscribe to Financial News? (yes/no): ");
        String financialNewsChoice = sc.nextLine().toLowerCase();
        user.setSubscribedToFinancialNews(financialNewsChoice.equals("yes"));

        return user;
    }
}