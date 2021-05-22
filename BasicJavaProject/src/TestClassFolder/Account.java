package TestClassFolder;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private Date dateCreated;

    private Client client;
    protected ArrayList<Transaction> transactions;

    public Account(int id, double balance, Client client) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
        this.client = client;
        this.transactions = new ArrayList<>();
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            this.transactions.add(new Transaction('W', amount, this.balance, "Withdrawn "+ amount));
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.transactions.add(new Transaction('D', amount, this.balance, "Deposited "+ amount));
    }

    public int countTransactions(char type)
    {
        int count = 0;
        for(Transaction transaction : this.transactions)
        {
            if(transaction.getType() == type)
            {
                count++;
            }
        }
        return count;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return this.id + " " + this.balance;
    }
}