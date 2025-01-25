package com.tit.day5javainheritance.hierarchicalInheritance.banksystem;


// Main class to test the hierarchy
public class BankSystem {
    public static void main(String[] args) {
        // Creating a generic bank account
        BankAccount genericAccount = new BankAccount("123456789", 1000.0);
        genericAccount.displayAccountType();
        System.out.println("Account Number: " + genericAccount.getAccountNumber());
        System.out.println("Balance: " + genericAccount.getBalance());
        System.out.println("-----------------");

        // Creating a savings account
        SavingsAccount savingsAccount = new SavingsAccount("987654321", 2000.0, 3.5);
        savingsAccount.displayAccountType();
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: " + savingsAccount.getBalance());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate() + "%");
        System.out.println("-----------------");

        // Creating a checking account
        CheckingAccount checkingAccount = new CheckingAccount("123987456", 1500.0, 500.0);
        checkingAccount.displayAccountType();
        System.out.println("Account Number: " + checkingAccount.getAccountNumber());
        System.out.println("Balance: " + checkingAccount.getBalance());
        System.out.println("Withdrawal Limit: " + checkingAccount.getWithdrawalLimit());
        checkingAccount.withdraw(600.0); // This should fail due to withdrawal limit
        checkingAccount.withdraw(400.0); // This should succeed
        System.out.println("Balance after withdrawal: " + checkingAccount.getBalance());
        System.out.println("-----------------");

        // Creating a fixed deposit account
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("789456123", 5000.0, 5.0, 12);
        fixedDepositAccount.displayAccountType();
        System.out.println("Account Number: " + fixedDepositAccount.getAccountNumber());
        System.out.println("Balance: " + fixedDepositAccount.getBalance());
        System.out.println("Interest Rate: " + fixedDepositAccount.getInterestRate() + "%");
        System.out.println("Maturity Period: " + fixedDepositAccount.getMaturityPeriod() + " months");
    }
}