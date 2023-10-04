import java.sql.*;

public class StoredDisplay {
    public static void main(String args[]) {
        try {
            String url = "jdbc:mysql://localhost/mca";
            String user = "root";
            String pass = "12345";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement st = conn.createStatement();
            String dropque = "Drop procedure if exists displayStudent";
            String createque = "Create procedure displayStudent(in roll int) "
                    + "Begin "
                    + "Select name from student where roll = roll; "
                    + "end";

            st.execute(dropque);
            st.execute(createque);
            st.close();
            System.out.println("Stored procedure for display created successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
