import java.util.HashMap;

class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Arun");
        students.put(2, "Kiran");

        System.out.println(students);

        // Get single value using key
        System.out.println(students.get(1));
    }
}