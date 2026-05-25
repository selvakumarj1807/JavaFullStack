class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading11 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Add Two Numbers: " + c.add(10, 20));
        System.out.println("Add Three Numbers: " + c.add(10, 20, 30));
        System.out.println("Add Two Doubles: " + c.add(10.5, 20.5));
    }
}