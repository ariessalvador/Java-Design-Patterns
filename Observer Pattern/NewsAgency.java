import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencyObserver {
    private String localNews;
    private String globalNews;
    private String financialNews;
    private String flashNews;
    private List<Subscriber> subscribersList= new ArrayList<>();
    public void setFinancialNews(String financialNews) {
        this.financialNews = financialNews;
    }
    public String getFlashNews() {
        return flashNews;
    }
    public void setFlashNews(String flashNews) {
        this.flashNews = flashNews;
    }
    public void setLocalNews(String localNews) {
        this.localNews = localNews;
    }
    public void setGlobalNews(String globalNews) {
        this.globalNews = globalNews;
    }
    @Override
    public void subscribe(Subscriber subscriber) {
        subscribersList.add(subscriber);
    }
    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribersList.remove(subscriber);
    }
    @Override
    public void publishNews() {
        System.out.println("Delivering Tailored News Updates:");
        for (Subscriber subscriber : subscribersList) {
            subscriber.flashNews(this);
            System.out.println("Subscriber: " + subscriber.getName());
            System.out.println("Here are your news based on your preferences.");
            if (subscriber.isSubscribedToGlobalNews())
                System.out.println("Latest Global News: " + globalNews);
            if (subscriber.isSubscribedToLocalNews())
                System.out.println("Breaking Local Stories: " + localNews);
            if (subscriber.isSubscribedToFinancialNews())
                System.out.println("Financial Insights: " + financialNews);
            System.out.println();
        }
    }
}
