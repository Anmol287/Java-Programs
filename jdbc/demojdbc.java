import java.sql.*;

public class demojdbc {
    public static void main(String args[]) throws SQLException {

        try {

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");

            if (conn != null) {
                System.out.println("Connection Established");
            } else {
                System.out.println("Connection failed");
            }

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");

            while (rs.next()) {
                System.out.println("Student ID: " + rs.getInt(1) + "\nStudent name: " + rs.getString(2)
                        + "\nStudent address: " + rs.getString(3));
            }
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
