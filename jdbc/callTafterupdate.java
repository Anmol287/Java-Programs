import java.sql.*;

public class callTafterupdate {
    public static void main(String[] args) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/mca1";
            String user = "root";
            String pass = "12345";

            Connection conn = DriverManager.getConnection(url, user, pass);
            if (conn != null)
                System.out.println("Connection established");
            else
                System.out.println("Connection failed");

            Statement st = conn.createStatement();

            st.executeUpdate("UPDATE students SET class = class + 1;  ");

            ResultSet rs = st.executeQuery("SELECT * FROM students_log");
            System.out.println("\n-----------Table contains--------");

            while (rs.next()) {
                System.out.println(rs.getString(1) + " \t " + rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
