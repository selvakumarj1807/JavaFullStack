import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadStudents {

    public static void main(String[] args) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "SELECT * FROM students";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("email") + " " +
                        rs.getDouble("marks")
                );
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}