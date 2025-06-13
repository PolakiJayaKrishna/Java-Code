//6. Write a BankAccount class with a private balance field and public methods to deposit and withdraw money.

package Encapsulation;

public class BankAccount {
    
    private float balance;

    public void deposite(float credit){
        if(credit > 0){
            balance = balance + credit;
            System.out.println("Deposited Amount: " + credit);
            
        }
        else {
            System.out.println("Invalid Balance");
        }
    }
    public void withdraw(float debit){
        if(debit > 0  && debit < balance){
            balance = balance - debit;
            System.out.println("Withdraw Amount: " + debit);
            
        }
        else {
            System.out.println("Not sufficent balance...");
        }
    }
    public void display(){
        System.out.println("Avaliable Balance: " + balance);
    }
}
class Main{
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.deposite(10000f);
        bank.display();


        bank.withdraw(1200f);
        bank.display();
    }
}
