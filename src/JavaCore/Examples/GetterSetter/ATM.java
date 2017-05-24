package JavaCore.Examples.GetterSetter;

/**
 * {@link Account}
 * @author John
 * @version 1.0
 *
 *
 * Created by john on 22.05.2017.
 */
public class ATM {

    public static void main(String[] args) {
//        Account account = new Account(1_000_000.00);
        Account account = new Account();
        account.setBalance(2_000_000.00);

        account.executeTransaction(-2_000_000.00);

//        account.balance = -1_000_000.00;

    }
}
