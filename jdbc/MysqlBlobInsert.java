import java.io.*;
import java.sql.*;

public class MysqlBlobInsert {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mca?serverTimezone=UTC";
        String user = "root";
        String password = "12345";
        String filePath = "D:/akk.png";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO insertphoto values (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Anmol");
            statement.setString(2, "Kansal");
            InputStream inputStream = new FileInputStream(new File(filePath));
            statement.setBlob(3, inputStream);
            int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("A contact was inserted with photo image.");
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}