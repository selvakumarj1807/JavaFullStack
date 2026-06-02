import java.io.FileWriter;
import java.io.IOException;

class WriteFileExample {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("student.txt");

            writer.write("Welcome to Java File Handling");
            writer.write("\nJava is powerful");

            writer.close();

            System.out.println("Data Written Successfully");

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}