package StatePattern_Lab1;

public class ActiveState implements AccountState {

    private Account account;

    public ActiveState(Account account) {
        this.account = account;
    }
    @Override
    public void deposit(double amount) {
        double currentBalance = account.getBalance();
        double newBalance = currentBalance + amount;
        account.setBalance(newBalance);
        System.out.println("Deposit successful. New balance: " + newBalance);
        System.out.println(account.toString());
        System.out.println();
    }
    @Override
    public void withdraw(double amount) {
        double balance = account.getBalance();
        switch (Double.compare(balance, amount)) {
            case 0:
                account.setBalance(balance - amount);
                System.out.println("Withdrawal successful." + account.getBalance());
                System.out.println(account.toString());
                System.out.println();
                break;
            case 1:
                account.setBalance(balance - amount);
                System.out.println("Withdrawal successful." + account.getBalance());
                System.out.println(account.toString());
                System.out.println();
                break;
            case -1:
                System.out.println("Insufficient funds");
                break;
        }
    }

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState(account));
        System.out.println("Account is suspended!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!");
    }
}
