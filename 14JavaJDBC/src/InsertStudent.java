import java.sql.Connection;
import java.sql.PreparedStatement;

class InsertStudent {

    public static void main(String[] args) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "INSERT INTO students VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, 101);
            ps.setString(2, "Ravi");
            ps.setString(3, "ravi@gmail.com");
            ps.setDouble(4, 85.5);

            int rows = ps.executeUpdate();

            System.out.println(rows +
                    " Record Inserted");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}