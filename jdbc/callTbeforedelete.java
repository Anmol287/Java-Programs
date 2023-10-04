import java.sql.*;

public class callTbeforedelete {
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

            st.executeUpdate("DELETE FROM salaries WHERE emp_num = 105;");

            ResultSet rs = st.executeQuery("SELECT * FROM salary_archives; ");
            System.out.println("\n-----------Table contains--------");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getInt(2) + "\t" + rs.getString(3) + " \t " + rs.getFloat(4)
                        + " \t " + rs.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
