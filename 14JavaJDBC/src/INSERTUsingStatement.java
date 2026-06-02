import java.sql.Connection;
import java.sql.Statement;

class InsertStudent {

    public static void main(String[] args) {

        try {

            Connection con =
                    DBConnection.getConnection();

            Statement st =
                    con.createStatement();

            String query =
                    "INSERT INTO students VALUES " +
                    "(101,'Ravi','ravi@gmail.com',85.5)";

            int rows =
                    st.executeUpdate(query);

            System.out.println(
                    rows + " Record Inserted"
            );

            con.close();

        } catch(Exception e) {

            System.out.println(e);

        }
    }
}