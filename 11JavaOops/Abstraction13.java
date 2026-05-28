abstract class Payment {

    abstract void pay(double amount);

    void paymentStatus() {
        System.out.println("Payment Processed");
    }
}

class CreditCardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}

class UPIPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

public class Abstraction13 {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        p1.pay(5000);

        Payment p2 = new UPIPayment();
        p2.pay(2000);

        p1.paymentStatus();
    }
}