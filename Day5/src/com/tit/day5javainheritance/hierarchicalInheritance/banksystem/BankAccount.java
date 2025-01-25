package com.tit.day5javainheritance.hierarchicalInheritance.banksystem;


import java.util.*;

// Base class for Bank Account
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor to initialize account number and balance
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to get the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Placeholder method to display account type
    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}
