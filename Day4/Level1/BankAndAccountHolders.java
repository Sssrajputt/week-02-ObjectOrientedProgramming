import java.util.ArrayList;
import java.util.List;

class Account {
    private int accountId;
    private double balance;

    public Account(int accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

//
class Customer {
    private int customerId;
    private String name;
    private List<Account> accounts;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public double viewBalance() {
        double totalBalance = 0;
        for (Account account : accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }

    public String getName() {
        return name;
    }
}


//bank class
class Bank {
    private int bankId;
    private String bankName;
    private List<Customer> customers;

    public Bank(int bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void openAccount(Customer customer, int accountId, double initialBalance) {
        Account newAccount = new Account(accountId, initialBalance);
        customer.addAccount(newAccount);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public String getBankName() {
        return bankName;
    }
}

//main class
public class BankAndAccountHolders {
    public static void main(String[] args) {
        Bank bank = new Bank(1, "Global Bank");
        Customer customer = new Customer(1, "Alice");

        bank.addCustomer(customer);
        bank.openAccount(customer, 101, 5000);
        bank.openAccount(customer, 102, 3000);

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Total Balance: " + customer.viewBalance());
    }
}
