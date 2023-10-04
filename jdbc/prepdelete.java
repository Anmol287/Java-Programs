import java.sql.*;

public class prepdelete {
    public static void main(String args[]) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");

            System.out.println("Delete the records from the table...\n");

            String sql = "delete from student where roll=8";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();

            System.out.println("....Record Deleted....");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
