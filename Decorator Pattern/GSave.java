public class GSave implements BankAccountDecorator {

    private BankAccount bankAccount;

    public GSave(BankAccount bankAccount) {
        setBankAccount(bankAccount);
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.025;
    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return this.bankAccount.showBenefits() + ", GSave Transfer";
    }

    @Override
    public Double computeBalanceWithInterest() {
        Double tempBalance = this.getBalance();
        return tempBalance + (tempBalance * this.getInterestRate());
    }
    @Override
    public String showInfo() {
        return this.bankAccount.showInfo();
    }
}