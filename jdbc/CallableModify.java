import java.sql.*;

public class CallableModify {
    public static void main(String args[]) {
        try {
            String url = "jdbc:mysql://localhost/mca";
            String user = "root";
            String pass = "12345";

            Connection conn = DriverManager.getConnection(url, user, pass);
            CallableStatement st = conn.prepareCall("{call modifyStudent(?,?)}");

            st.setInt(1, 3);
            st.setString(2, "Anmol");
            st.execute();
            st.close();

            System.out.println("Update, Stored procedure called successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
