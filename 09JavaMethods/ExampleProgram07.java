// Real-Time Example Program

class Student {

    // Method to display student name
    void displayName(String name) {
        System.out.println("Student Name: " + name);
    }

    // Method to calculate total marks
    int totalMarks(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    // Static method
    static void course() {
        System.out.println("Course: Java Programming");
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.displayName("Arun");

        int total = s.totalMarks(80, 75, 90);
        System.out.println("Total Marks: " + total);

        course();
    }
}