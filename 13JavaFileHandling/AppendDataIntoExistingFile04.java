import java.io.FileWriter;
import java.io.IOException;

class AppendFileExample {
    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("student.txt", true);

            writer.write("\nNew Student Added");

            writer.close();

            System.out.println("Data Appended");

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}