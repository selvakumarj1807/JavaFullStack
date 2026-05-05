// 5. Static Method (No Need to Create Object)

class Bank {

    static double getInterest(double amount) {
        return amount * 0.05;
    }
 
    public static void main(String[] args) {
        double interest = getInterest(10000);
        System.out.println("Interest: " + interest);
    }
}

/*
class Demo {
    static void show() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        show();
    }
}
*/