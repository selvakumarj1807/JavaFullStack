import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateStudent {

    public static void main(String[] args) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "UPDATE students SET marks=? WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setDouble(1, 95.0);
            ps.setInt(2, 101);

            int rows =
                    ps.executeUpdate();

            System.out.println(rows +
                    " Record Updated");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}