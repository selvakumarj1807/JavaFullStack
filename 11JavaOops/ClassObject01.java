class Car {
    String brand;
    int speed;

    void start() {
        System.out.println("Car Started");
    }
}

public class ClassObject01 {
    public static void main(String[] args) {

        System.out.println("Car Object 01 : ");
        Car c1 = new Car();

        c1.brand = "BMW";
        c1.speed = 200;

        c1.start();

        System.out.println(c1.brand);
        System.out.println(c1.speed);

        System.out.println("Car Object 02 : ");
        Car c2 = new Car();

        c2.brand = "Audi";
        c2.speed = 180;

        c2.start();

        System.out.println(c2.brand);
        System.out.println(c2.speed);
    }
}

    