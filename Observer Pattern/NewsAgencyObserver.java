public interface NewsAgencyObserver {
    public void subscribe(Subscriber subscriber);
    public void unsubscribe(Subscriber subscriber);
    public void publishNews();
}
