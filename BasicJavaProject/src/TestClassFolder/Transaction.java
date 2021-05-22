package TestClassFolder;

import java.util.Date;
// immuatable class: after creating an object we will not be able to change any property. no getter and setter
public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private Date date;
    private String description;


    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.date = new Date();
        this.description = description;
    }

    public char getType()
    {
        return type;
    }
}