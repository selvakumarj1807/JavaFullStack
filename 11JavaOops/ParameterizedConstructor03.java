class Student {

    String name;
    int age;

    Student(String n, int a) {

        name = n;
        age = a;
    }

    void display() {

        System.out.println(name);
        System.out.println(age);
    }
}

public class ParameterizedConstructor03 {

    public static void main(String[] args) {

        Student s1 = new Student("Selva", 25);

        s1.display();
    }
}