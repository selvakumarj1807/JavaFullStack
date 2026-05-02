import java.util.ArrayList;

class CollectionMethodsExample {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("List: " + fruits);

        // get()
        System.out.println("First Fruit: " + fruits.get(0));

        // contains()
        System.out.println("Contains Mango: " + fruits.contains("Mango"));

        // size()
        System.out.println("Size: " + fruits.size());

        // remove()
        fruits.remove("Banana");
        System.out.println("After Remove: " + fruits);

        // isEmpty()
        System.out.println("Is Empty: " + fruits.isEmpty());

        // clear()
        fruits.clear();
        System.out.println("After Clear: " + fruits);
    }
}