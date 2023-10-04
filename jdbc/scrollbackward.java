import java.sql.*;

public class scrollbackward {
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

            rs.last();
            System.out.println("Last record");
            System.out.println(rs.getInt(1) + "--" + rs.getString(2));

            System.out.println("------Scrolling continues-------\n");

            rs.previous();
            System.out.println("--Previous record--");
            System.out.println(rs.getInt(1) + "--" + rs.getString(2));

            System.out.println("------Scrolling continues-------\n");

            rs.previous();
            System.out.println("--Previous record--");
            System.out.println(rs.getInt(1) + "--" + rs.getString(2));

            System.out.println("------Scrolling Ended-------");

            conn.close();
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
