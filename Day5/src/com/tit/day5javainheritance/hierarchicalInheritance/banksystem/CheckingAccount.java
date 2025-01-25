package com.tit.day5javainheritance.hierarchicalInheritance.banksystem;

// Subclass for Checking Account
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor to initialize account number, balance, and withdrawal limit
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to get the withdrawal limit
    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    // Override method to display account type
    @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
    }

    // Override withdraw method to enforce withdrawal limit
    @Override
    public boolean withdraw(double amount) {
        if (amount <= withdrawalLimit) {
            return super.withdraw(amount);
        } else {
            System.out.println("Withdrawal limit exceeded!");
            return false;
        }
    }
}