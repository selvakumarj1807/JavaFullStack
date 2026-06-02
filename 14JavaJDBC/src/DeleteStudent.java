import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteStudent {

    public static void main(String[] args) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "DELETE FROM students WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, 101);

            int rows =
                    ps.executeUpdate();

            System.out.println(rows +
                    " Record Deleted");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}