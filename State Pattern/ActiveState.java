package StatePattern_Lab1;

public class ActiveState implements AccountState{
    private Account account;

    public ActiveState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit successful. New balance: " + account.getBalance());
        System.out.println(account.toString());
        System.out.println();
    }

    @Override
    public void withdraw(double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
            System.out.println(account.toString());
            System.out.println();
        } else {
            System.out.println("Insufficient funds");
            System.out.println(account.toString());
            System.out.println();
        }
    }

    @Override
    public void suspend() {
        account.setAccountState(new SuspendedState(account));
        System.out.println("Account is suspended!");
    }

    @Override
    public void activate() {
        System.out.println("Account is already activated!");
    }

    @Override
    public void close() {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!");
    }

}
