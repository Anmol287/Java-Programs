import java.sql.*;

public class CallableInsert {
    public static void main(String args[]) {
        try {
            String url = "jdbc:mysql://localhost/mca";
            String user = "root";
            String pass = "12345";

            Connection conn = DriverManager.getConnection(url, user, pass);
            CallableStatement st = conn.prepareCall("{call insertStudent(?,?,?,?)}");

            st.setInt(1, 14);
            st.setString(2, "Anmol");
            st.setInt(3, 056);
            st.setString(4, "JAVA");
            st.execute();
            st.close();

            System.out.println("Insert, Stored procedure called successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
