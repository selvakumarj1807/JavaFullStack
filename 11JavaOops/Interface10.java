// Step 1: Create Interface

interface Payment {

    void pay(double amount);

    void refund(double amount);
}

// Step 2: Implement Interface

class GooglePay implements Payment {

    public void pay(double amount) {

        System.out.println("Google Pay Payment: " + amount);
    }

    public void refund(double amount) {

        System.out.println("Google Pay Refund: " + amount);
    }
}

class PhonePe implements Payment {

    public void pay(double amount) {

        System.out.println("PhonePe Payment: " + amount);
    }

    public void refund(double amount) {

        System.out.println("PhonePe Refund: " + amount);
    }
}


// Step 3: Main Class

public class Interface10 {

    public static void main(String[] args) {

        Payment gpay = new GooglePay();

        gpay.pay(5000);
        gpay.refund(1000);

        System.out.println();

        Payment phonepe = new PhonePe();

        phonepe.pay(3000);
        phonepe.refund(500);
    }
}