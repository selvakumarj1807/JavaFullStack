import java.io.File;
import java.io.IOException;

class CreateFileExample {
    public static void main(String[] args) {

        try {
            File file = new File("student.txt");

            if(file.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File Already Exists");
            }

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}