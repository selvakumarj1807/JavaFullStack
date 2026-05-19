class Mobile {

    Mobile() {

        System.out.println("Default Mobile");
    }

    Mobile(String brand) {

        System.out.println(brand);
    }

    Mobile(String brand, int price) {

        System.out.println(brand + " " + price);
    }
}

public class ConstructorOverloading05 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Apple");
        Mobile m3 = new Mobile("Samsung", 50000);
    }
}
