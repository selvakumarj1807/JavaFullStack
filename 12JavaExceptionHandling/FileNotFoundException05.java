import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class FileExceptionDemo {

    public static void main(String[] args) {

        try {

            File file = new File("invoice.pdf");

            FileInputStream fis = new FileInputStream(file);

            System.out.println("File Found");

        } catch (FileNotFoundException e) {

            System.out.println("Invoice file not found.");
            System.out.println(e);

        }
    }
}