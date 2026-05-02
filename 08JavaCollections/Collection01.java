import java.util.ArrayList;

public class Collection01 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println(fruits);

        fruits.remove("Mango"); // Use value or index to remove an element

        System.out.println(fruits);

        System.out.println(fruits.get(1)); // Banana
    }
}