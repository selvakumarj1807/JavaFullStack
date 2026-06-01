import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class SQLExceptionDemo {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "wrongpassword"
            );

            System.out.println("Connected");

        } catch (SQLException e) {

            System.out.println("Database connection failed.");
            System.out.println(e);

        }
    }
}