package OOPS.Abstraction;

abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void makePayment();

    public void paymentDetails() {
        System.out.println("Amount: " + amount);
    }
}

class CreditCardPayment extends Payment {
    CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Processing credit card payment of " + amount);
    }
}

class UPIPayment extends Payment {
    UPIPayment(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Processing UPI payment of " + amount);
    }
}

public class PayementDemo {
    public static void main(String[] args) {
        CreditCardPayment obj = new CreditCardPayment(5000);
        obj.paymentDetails();
        obj.makePayment();
        UPIPayment obj1 = new UPIPayment(1500);
        obj1.paymentDetails();
        obj1.makePayment();
    }
}
