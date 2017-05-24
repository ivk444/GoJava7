package JavaCore.Examples.GetterSetter;

//import java.math.BigDecimal;
import java.util.Date;

/**
 * (@link )
 * Created by john on 22.05.2017.
 */
public class Account {
    private Double balance;

    public Account() {
    }

    public Account(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void executeTransaction(Double amount){
        this.balance += amount;
        System.out.println("Transaction...");
        System.out.println(new Date());
        System.out.println("Sum: " + amount);
        System.out.println("New balance: " + this.balance);
    }

}