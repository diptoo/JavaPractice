package TestClassFolder;

public class CurrentAccount extends Account {
    private double limitBelowZero;

    public CurrentAccount(int id, double balance, Client client, double limitBelowZero) {
        super(id, balance, client);
        this.limitBelowZero = limitBelowZero;
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.getBalance() - amount < this.limitBelowZero) {
            return false;
        }
        super.setBalance(super.getBalance() - amount);
        super.transactions.add(new Transaction('W', amount, super.getBalance(), "Withdrawn"));

        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " limit below zero";
    }
}