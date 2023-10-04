import java.sql.*;

public class callTbeforeinsert {
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

            st.executeUpdate("INSERT INTO employee VALUES ('ANMOL', 'Developer', '2023-01-08', 8)");
            st.executeUpdate("INSERT INTO employee VALUES ('Alexa', 'Actor', '2022-10-01', -10)");

            ResultSet rs = st.executeQuery("SELECT * FROM employee");
            System.out.println("\n-----------Table contains--------");

            while (rs.next()) {
                System.out.println(rs.getString(1) + " \t " + rs.getString(2) + " \t " + rs.getString(3)
                        + " \t\t " + rs.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
