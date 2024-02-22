package StatePattern_Lab1;

public interface AccountState {
    public void deposit(double depositBalance);
    public void withdraw(double withdrawBalance);
    public void activate();
    public void suspend();
    public void close();
}
