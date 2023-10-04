import java.sql.*;

public class CallableDisplay {
    public static void main(String args[]) {
        try {
            String url = "jdbc:mysql://localhost/mca";
            String user = "root";
            String pass = "12345";

            Connection conn = DriverManager.getConnection(url, user, pass);
            CallableStatement st = conn.prepareCall("{call displayStudent(?)}");

            st.setInt(1, 2);

            st.close();

            System.out.println("Stored procedure called successfully for display");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
