import java.util.ArrayList;

class CollectionMethodsExample {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Add Data
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("After Add: " + fruits);

        // Remove Data
        fruits.remove("Banana");

        System.out.println("After Remove: " + fruits);

        // Search Data
        if(fruits.contains("Apple")){
            System.out.println("Apple Found");
        } else {
            System.out.println("Apple Not Found");
        }
    }
}