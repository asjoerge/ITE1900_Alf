import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Account account = new Account("George Best", 7, 1000, 1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        ArrayList<Transaction> transactions = account.transactions;
        System.out.println("Name: " + account.getName() + "\nInterest Rate: " + account.getAnnualInterestRate() + "\nBalance: " + account.getBalance());
        for(Transaction trans : transactions) {
            System.out.println(trans.toString());
        }
    }
}
