import java.sql.*;

public class prepselect {
    public static void main(String args[]) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");

            PreparedStatement ps = con.prepareStatement("select * from student1");
            ResultSet rs = ps.executeQuery();

            System.out.println("-----------Now Table Contains following  data -----------");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + "   " + rs.getInt(3) + "  " + rs.getString(4));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}