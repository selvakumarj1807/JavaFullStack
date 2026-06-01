import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ThrowsDemo {

    static void readFile() throws FileNotFoundException {

        FileInputStream fis =
                new FileInputStream("data.txt");

    }

    public static void main(String[] args) {

        try {

            readFile();

        } catch (FileNotFoundException e) {

            System.out.println("Handled in main method");

        }
    }
}