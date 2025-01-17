import java.util.*;

// Creating BankAccount class
class BankAccount {

    // Creating attributes of class
    String accountHolder;
    int accountNumber;
    double balance;

    // Creating a constructor to initialize attributes
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        // Using this keyword to initialize attributes
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public double depositingMoney(Scanner input) {

        System.out.println("total balance in account: " + balance);

        // Taking user input for depositing money
        System.out.println("Enter the money you want to deposit: ");
        double depositAmount = input.nextDouble();
        balance += depositAmount;
        System.out.println("balance remaining: " + balance);
        return balance;
    }

    // Method to withdraw money
    public double withdrawingMoney(Scanner input) {

        System.out.println("total balance in account: " + balance);

        System.out.println("Enter the money you want to withdraw: ");
        double withdrawMoney = input.nextDouble();
        if (balance >= withdrawMoney) {
            balance -= withdrawMoney;
        System.out.println("remaining balance: " + balance);
        } else {
            System.out.println("Insufficient money");
            System.out.println("remaining balance: " + balance);

        }
        return balance;
    }

    // Method for displaying details
    public void display() {
        // Displaying the details
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

// Creating Main class
public class SimulateAnAtm {
    public static void main(String args[]) {

        // Creating Scanner class object
        Scanner input = new Scanner(System.in);

        // Creating BankAccount class object
        BankAccount bankAccount = new BankAccount("Shubham", 382364734, 434340.0);

        // Displaying the depositing money
        bankAccount.depositingMoney(input);

        // Displaying the withdrawing money
        bankAccount.withdrawingMoney(input);

        // Displaying bank account details
        bankAccount.display();
    }
}






