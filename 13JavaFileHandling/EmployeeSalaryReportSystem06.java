import java.io.FileWriter;
import java.io.IOException;

class EmployeeReport {
    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("employees.txt");

            writer.write("101,Ravi,50000");
            writer.write("\n102,Kumar,60000");
            writer.write("\n103,Priya,70000");

            writer.close();

            System.out.println("Employee Report Generated");

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}