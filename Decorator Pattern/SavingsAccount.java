public class SavingsAccount implements BankAccount{
    private String accountNumber;
    private String accountName;
    private Double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = String.valueOf(accountNumber);
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    @Override
    public String showAccountType() {
        return "Saving Account";
    }

    @Override
    public Double getInterestRate() {
        return 0.01;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public Double computeBalanceWithInterest() {
        return balance + (balance * getInterestRate());
    }

    @Override
    public String showInfo() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Name: " + this.accountName);
        System.out.println("Balance: "+ this.balance);
        return "";
    }
}
