
import java.util.HashMap;
import java.util.Map;

class HashMapLoopExample {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Arun");
        students.put(2, "Kiran");
        students.put(3, "Rahul");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("-----------------------------------------------");

        for (Integer key : students.keySet()) {
            System.out.println(key);
        }

        System.out.println("-----------------------------------------------");

        for (String value : students.values()) {
            System.out.println(value);
        }
    }
}
