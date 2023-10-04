import java.sql.*;

public class callTafterinsert {
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

            st.executeUpdate("INSERT INTO student_info VALUES (10, 110, 'Alexandar', 'Biology', 67, '2347346438');");

            ResultSet rs = st.executeQuery("SELECT * FROM student_detail");
            System.out.println("\n-----------Table contains--------");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + rs.getString(2) + " \t " + rs.getString(3) + " \t " + rs.getString(4)
                        + " \t\t " + rs.getInt(5) + "  " + rs.getString(6) + "  " + rs.getString(7));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
