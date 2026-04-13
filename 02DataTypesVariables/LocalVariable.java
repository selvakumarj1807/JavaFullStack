class Student {
    void display() {

        // Local Variable (inside method)
        int marks = 90;

        System.out.println("Local Variable (marks): " + marks);
    }
}

public class LocalVariable {
    public static void main(String[] args) {

        Student s1 = new Student();
       
        s1.display();
    }
}
