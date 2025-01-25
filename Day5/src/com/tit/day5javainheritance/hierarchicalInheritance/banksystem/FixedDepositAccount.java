package com.tit.day5javainheritance.hierarchicalInheritance.banksystem;

// Subclass for Fixed Deposit Account
class FixedDepositAccount extends BankAccount {
    private double interestRate;
    private int maturityPeriod;

    // Constructor to initialize account number, balance, interest rate, and maturity period
    public FixedDepositAccount(String accountNumber, double balance, double interestRate, int maturityPeriod) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.maturityPeriod = maturityPeriod;
    }

    // Method to get the interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Method to get the maturity period
    public int getMaturityPeriod() {
        return maturityPeriod;
    }

    // Override method to display account type
    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}