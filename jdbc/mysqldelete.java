import java.sql.*;

public class mysqldelete {
    public static void main(String args[]) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");
            Statement stmt = conn.createStatement();
            System.out.println("Deleting the records from the table...");

            String sql = "delete from student where roll=7";
            stmt.executeUpdate(sql);

            System.out.println("Record deleted from the table");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
