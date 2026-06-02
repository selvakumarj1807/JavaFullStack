import java.io.File;

class DeleteFileExample {
    public static void main(String[] args) {

        File file = new File("student.txt");

        if(file.delete()) {
            System.out.println("File Deleted");
        } else {
            System.out.println("File Not Found");
        }
    }
}