class Account {
    private String accountName;
    private int accountNumber;
    private double balance;

    public Account(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public Account(String accountName, int accountNumber, double initialBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }


    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}



public class Transaction{
        public static void main(String[] args) {
            Account account1 = new Account("Isaac Afrifa",287238);
            Account account2 = new Account("Desire Kwabena", 210777);

            System.out.println("Details for account1 are:");
            System.out.println("Account Name:" + account1.getAccountName());
            System.out.println("Account Number:" + account1.getAccountNumber());
            System.out.println("Details for account2 are:");
            System.out.println("Account Name:" + account2.getAccountName());
            System.out.println("Account Number:" + account2.getAccountNumber());
        }

    }





