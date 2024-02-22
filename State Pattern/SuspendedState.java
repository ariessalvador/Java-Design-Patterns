package StatePattern_Lab1;

public class SuspendedState implements AccountState {
    private Account account;

    public SuspendedState(Account account) {
        this.account = account;
    }
    @Override
    public void deposit(double amount) {
        System.out.println("You cannot deposit on a suspended account!");
        System.out.println(account.toString());
        System.out.println();
    }
    @Override
    public void withdraw(double amount) {
        System.out.println("You cannot withdraw from a suspended account!");
        System.out.println(account.toString());
        System.out.println();
    }
    @Override
    public void suspend() {
        System.out.println("Account is already suspended!");
    }
    @Override
    public void activate() {
        account.setAccountState(new ActiveState(account));
        System.out.println("Account is activated!");
    }
    @Override
    public void close() {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!");
    }
}
