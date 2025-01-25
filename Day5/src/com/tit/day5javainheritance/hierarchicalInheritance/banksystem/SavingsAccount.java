package com.tit.day5javainheritance.hierarchicalInheritance.banksystem;

// Subclass for Savings Account
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor to initialize account number, balance, and interest rate
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to get the interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Override method to display account type
    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }
}
