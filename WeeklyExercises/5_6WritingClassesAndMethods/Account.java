import java.text.NumberFormat;

public class Account
{
    private final double RATE = 0.035;  // interest rate of 3.5%

    private String name;
    private long acctNumber;
    private double balance;

    public Account (String owner, long account, double initial)
    {
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    public Account(String owner, long account)
    {
        name = owner;
        acctNumber = account;
        balance = 0.0;
    }

    public String toString ()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}


class Transactions {
    public static void main(String[] args) {
        Account account1 = new Account("Isaac Afrifa", 209777, 100000000000.0);
        Account account2 = new Account("Desire Kwabena", 387999);

        System.out.println("Account 1 Details:");
        System.out.println(account1.toString());

        System.out.println("\nAccount 2 Details:");
        System.out.println(account2.toString());
    }
}
