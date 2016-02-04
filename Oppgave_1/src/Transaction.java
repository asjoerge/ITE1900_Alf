import java.util.*;

public class Transaction {

    private Date dateCreated;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction (char type, double amount, double balance, String description) {
        dateCreated = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public char getType() {
        return type;
    }
    public double getAmount() {
        return amount;
    }
    public double getBalance() {
        return balance;
    }
    public String getDescription() {
        return description;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String toString() {
        return (type + " " + amount +  " " + balance + " " + dateCreated + " " + description);


    }


}
