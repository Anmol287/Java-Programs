import java.sql.*;

public class callTbeforeupdate {
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

            st.executeUpdate("UPDATE sales_info SET quantity = 125 WHERE id = 2;");
            st.executeUpdate("UPDATE sales_info SET quantity = 600 WHERE id = 2;");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
