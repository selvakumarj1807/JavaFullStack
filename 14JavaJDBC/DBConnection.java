import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String url = "jdbc:mysql://localhost:3306/college";
    static String user = "root";
    static String password = "";

    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
                url, user, password);
    }

    public static void main(String[] args) {

        try {

            Connection con = getConnection();

            System.out.println(
                    "Database Connected Successfully");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}