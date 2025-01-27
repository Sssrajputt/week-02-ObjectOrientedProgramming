package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.bankingsystem;

// Subclass CurrentAccount
public class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate;
    private double loanEligibility;

    public CurrentAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    @Override
    public void applyForLoan(double amount) {
        loanEligibility = getBalance() * 0.3; // Example calculation
    }

    @Override
    public double calculateLoanEligibility() {
        return loanEligibility;
    }
}
