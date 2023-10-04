import java.sql.*;

public class StoredProc {
    public static void main(String args[]) {
        try {
            String url = "jdbc:mysql://localhost/sahiltry";
            String user = "root";
            String pass = "S123";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement st = conn.createStatement();
            String dropque = "Drop procedure if exists deleteStudent";
            String createque = "Create procedure deleteStudent(in roll int) Begin delete from stu where Rollno = roll;";
            createque+="end;";

            st.execute(dropque);
            st.execute(createque);
            st.close();
            System.out.println("Stored procedure created successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
