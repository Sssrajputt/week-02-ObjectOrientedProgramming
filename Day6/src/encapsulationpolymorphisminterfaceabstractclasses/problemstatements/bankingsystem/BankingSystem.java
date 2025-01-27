package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.bankingsystem;


// Main class to test the banking system
import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        // List to store bank accounts
        List<BankAccount> accounts = new ArrayList<>();

        // Add SavingsAccount
        SavingsAccount savings = new SavingsAccount("SA123", "John Doe", 10000, 4.5);
        savings.applyForLoan(5000);
        accounts.add(savings);

        // Add CurrentAccount
        CurrentAccount current = new CurrentAccount("CA123", "Jane Doe", 20000, 3.0);
        current.applyForLoan(5000);
        accounts.add(current);

        // Calculate and display interest and loan eligibility for each account
        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
            }

            System.out.println("---------------------");
            System.out.println();
        }
    }
}


