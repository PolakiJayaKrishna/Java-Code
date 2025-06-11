package OOPS.Encapsulation;

public class ATMAccount {

    private int pin;
    private double balance;
    private long accountNumber;

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        ATMAccount obj = new ATMAccount();
        obj.setAccountNumber(781234567);
        obj.setPin(1111);
        obj.setBalance(10000.44);
        System.out.println("Account Number: " + obj.getAccountNumber());
        System.out.println("Pin is: " + obj.getPin());
        System.out.println("Avaliable Balance: " + obj.getBalance());
    }
}
