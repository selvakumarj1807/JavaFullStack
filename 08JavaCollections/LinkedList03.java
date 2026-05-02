import java.util.LinkedList;

class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Chennai");
        cities.addFirst("Mumbai");
        cities.add("Delhi");

        System.out.println(cities);
    }
}