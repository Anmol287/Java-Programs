import java.io.*;
import java.sql.*;

public class videoblob {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mca";
        String user = "root";
        String password = "12345";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "insert into insertvideo values (?)";
            PreparedStatement statement = conn.prepareStatement(sql);

            InputStream video1 = new FileInputStream(new File("akk.mp4"));
            statement.setBlob(1, video1);
            int row = statement.executeUpdate();
            System.out.println("---Uploading---");

            if (row > 0) {
                System.out.println("Video has been uploaded.");
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}