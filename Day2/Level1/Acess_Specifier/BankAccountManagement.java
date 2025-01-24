// Class representing a Bank Account with fields and methods
class BankAccount {
    public String accountNumber;    // Public: accessible anywhere
    protected String accountHolder; // Protected: accessible in the same package and subclasses
    private double balance;         // Private: accessible only within this class

    // Constructor to initialize the bank account details
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
    
}

// Subclass representing a Savings Account, inheriting from BankAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // Additional attribute for SavingsAccount

    // Constructor to initialize SavingsAccount details
    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance); // Call to parent class constructor
        this.interestRate = interestRate;
    }

    
    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        displayAccountDetails(); // Call parent method to display basic account details
        
    }
    public void savingDeposite(double amount){
        deposit(amount);
    }
    public void savingWithdraw(double amount){
        withdraw(amount);
    }

}

// Main class to test BankAccount and SavingsAccount
public class BankAccountManagement{
    public static void main(String[] args) {
        // Create a BankAccount instance
        BankAccount account = new BankAccount("123456789", "John Doe", 5000);
        System.out.println("Bank Account Details:");
        account.displayAccountDetails();

        System.out.println();
        account.deposit(1500); // Deposit money
        account.withdraw(2000); // Withdraw money
        account.displayAccountDetails(); // Display updated account details

        System.out.println();

        // Create a SavingsAccount instance
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Jane Doe", 10000, 5);
        System.out.println("Savings Account Details:");
        savingsAccount.displaySavingsAccountDetails();
        System.out.println();
        savingsAccount.deposit(1800); // Deposit money
        savingsAccount.withdraw(2000); // Withdraw money
        savingsAccount.displayAccountDetails(); // Display updated account details


    }
}
