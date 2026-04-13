class Student02 {
    // Static Variable (common for all objects)
    static String college = "ABC College";

    void display() {
        System.out.println("Static Variable (college): " + college);
    }
}

public class StaticVariable {
    public static void main(String[] args) {

        Student02 s1 = new Student02();

        s1.display();

        System.out.println("-----------");

        // Changing static variable
        Student02.college = "XYZ College";

        Student02 s2 = new Student02();

        s2.display();
       
    }
}
