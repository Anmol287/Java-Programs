import java.sql.*;

public class StoredModify {
    public static void main(String args[]) {
        try {
            String url = "jdbc:mysql://localhost/mca";
            String user = "root";
            String pass = "12345";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement st = conn.createStatement();
            String dropque = "Drop procedure if exists modifyStudent";
            String createque = "Create procedure modifyStudent(in roll int, grade varchar(20)) "
                    + "begin update student set name = grade where roll = roll; "
                    + "end";

            st.execute(dropque);
            st.execute(createque);
            st.close();
            System.out.println("Stored procedure created successfully for update");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
