class Student {
}

class ClassNotFoundDemo {

    public static void main(String[] args) {

        try {

            Class.forName("Student");

            System.out.println("Class Found");

        } catch (ClassNotFoundException e) {

            System.out.println("Class Not Found");
        }
    }
}


/*
Why use Class.forName()?
------------------------
It is commonly used when:
-------------------------
    1. Loading JDBC drivers
    2. Loading classes dynamically at runtime
    3. Reflection in Java
*/