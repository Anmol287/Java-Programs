import java.sql.*;

public class prepinsert {
    public static void main(String args[]) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");

            PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?,?)");
            ps.setInt(1, 12);
            ps.setString(2, "Anmol");
            ps.setInt(1, 056);
            ps.setString(3, "Noida");

            System.out.println("-----------Record inserted into the table -----------");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
