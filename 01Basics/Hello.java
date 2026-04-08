class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}

/*
Step-by-Step Explanation
------------------------
1. class Hello
    1. Defines a class
    2. File name must be: Hello.java

2. public static void main(String[] args)
    1. main method is the entry point of the program
    2. public: accessible from anywhere
    3. static: No need to create object to call this method
    4. void: does not return any value
    5. String[] args: an array of strings that can hold command-line arguments

3. System.out.println("Hello, Java!");
    1. System: a built-in class that provides access to system resources
    2. out: a static member of the System class
    3. println: a method that prints a line of text to the console

--------------------------------------------------------------

Rule: Class Name = File Name in Java

In Java, there is an important rule:

If a class is public, then the file name MUST be the same as the class name
*/
