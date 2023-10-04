import java.sql.*;

public class MySqlScrolling {
    public static void main(String args[]) {

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca?serverTimezone=UTC", "root",
                "12345")) {
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection");
            }

            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("Select * from student1");

            System.out.println("\n------Scrolling started-------");
            rs.first();
            System.out.println("First record");

            System.out.println(rs.getInt(1) + "--" + rs.getString(2));
            System.out.println("------Scrolling started-------");
            rs.absolute(3);
            System.out.println("Third record");

            System.out.println(rs.getInt(1) + "--" + rs.getString(2));
            System.out.println("------Scrolling continues-------");
            rs.last();
            System.out.println("Last record");

            System.out.println(rs.getInt(1) + "--" + rs.getString(2));

            System.out.println("------Scrolling over now--------");
            conn.close();
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}