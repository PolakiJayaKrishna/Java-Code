package OOPS.Encapsulation;
public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountDetails(String accNo, String name, double initialBalance) {
        this.accountNumber = accNo;
        this.accountHolder = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountDetails("99220040690", "P.JayaKrishna", 0);
        myAccount.deposit(5000);
        myAccount.withdraw(2000);
        System.out.println("Final Balance: ₹" + myAccount.getBalance());
    }
}