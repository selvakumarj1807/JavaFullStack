class Product {

    String name;
    int price;

    Product(String n, int p) {

        name = n;
        price = p;
    }

    // Copy Constructor
    Product(Product p) {

        name = p.name;
        price = p.price;
    }

    void display() {

        System.out.println(name + " " + price);
    }
}

public class CopyConstructor04 {

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 70000);

        Product p2 = new Product(p1);

        p2.display();
    }
}