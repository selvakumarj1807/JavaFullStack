// 3. Method With Parameters but Without Return Value

class Student {

    void displayResult(String name, int marks) {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.displayResult("Arun", 85);
    }
}