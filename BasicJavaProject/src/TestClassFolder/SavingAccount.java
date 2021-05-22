package TestClassFolder;

public class SavingAccount extends Account{
    private double annualInterestRate;


    public SavingAccount(int id, double balance, Client client, double annualInterestRate) {
        super(id, balance, client);
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public String toString() {
        return super.toString() + "Saving account";
    }
}