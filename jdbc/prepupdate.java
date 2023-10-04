import java.sql.*;

public class prepupdate {
    public static void main(String args[]) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");

            System.out.println("Update the records from the table...\n");

            String sql = "update student set name='Kansal' where roll=7";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();

            System.out.println("....Record Updated....");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
