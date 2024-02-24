package StatePattern_Lab1;

public interface AccountState {
    public void deposit(double depositBalance);
    public void withdraw(double withdrawAmount);
    public void activate(Account account);
    public void suspend(Account account);
    public void close(Account account);
}
