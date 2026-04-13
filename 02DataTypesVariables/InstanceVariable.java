class Student01 {

    // Instance Variable (belongs to object)
    int id = 101;


    void display() {
        System.out.println("Instance Variable (id): " + id);
    }
}

public class InstanceVariable {
    public static void main(String[] args) {

        Student01 s1 = new Student01();

        s1.display();
    }
}
