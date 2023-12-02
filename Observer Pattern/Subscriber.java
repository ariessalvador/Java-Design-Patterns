public class Subscriber implements SubscriberObserver{
    private String name;
    private boolean isSubscribedToLocalNews;
    private boolean isSubscribedToGlobalNews;
    private boolean isSubscribedToFinancialNews;
    public boolean isSubscribedToFinancialNews() {
        return isSubscribedToFinancialNews;
    }

    public void setSubscribedToFinancialNews(boolean subscribedToFinancialNews) {
        isSubscribedToFinancialNews = subscribedToFinancialNews;
    }
    public String getName() {
        return name;
    }
    public void setName(String Name) {
        this.name = Name;
    }
    public boolean isSubscribedToLocalNews() {
        return isSubscribedToLocalNews;
    }
    public void setSubscribedToLocalNews(boolean subscribedToLocalNews) {
        isSubscribedToLocalNews = subscribedToLocalNews;
    }
    public boolean isSubscribedToGlobalNews() {
        return isSubscribedToGlobalNews;
    }
    public void setSubscribedToGlobalNews(boolean subscribedToGlobalNews) {
        isSubscribedToGlobalNews = subscribedToGlobalNews;
    }
    @Override
    public void flashNews(NewsAgency newsAgency) {
        System.out.println("FLASH NEWS!!");
        System.out.println("Breaking News: " + newsAgency.getFlashNews());
        System.out.println();
    }
}
