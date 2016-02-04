import java.util.*;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(String name, int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.name = name;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate() {
        return balance*(annualInterestRate / 1200);
    }
    public double deposit(double amount) {
        balance += amount;
        Transaction deposit = new Transaction('D', amount, this.balance, "Deposit made");
        transactions.add(deposit);
        return this.balance;
    }
    public double withdraw(double amount) {
        balance -= amount;
        Transaction withdraw = new Transaction('W', amount, this.balance, "Withdraw made");
        transactions.add(withdraw);
        return this.balance;
    }

}
