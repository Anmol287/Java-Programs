import java.sql.*;

public class Tbeforeupdate {
    public static void main(String[] args) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/mca1";
            String user = "root";
            String pass = "12345";

            Connection conn = DriverManager.getConnection(url, user, pass);
            if (conn != null)
                System.out.println("Connection established");
            else
                System.out.println("Connection failed");

            Statement st = conn.createStatement();

            String tquery = "CREATE TRIGGER before_update_salesInfo "
                    + " BEFORE UPDATE "
                    + " ON sales_info FOR EACH ROW "
                    + " BEGIN "
                    + "  DECLARE error_msg VARCHAR(255);"
                    + " SET error_msg = ('The new quantity cannot be greater than 2 times the current quantity'); "
                    + " IF new.quantity > old.quantity * 2 THEN "
                    + " SIGNAL SQLSTATE '45000' "
                    + " SET MESSAGE_TEXT = error_msg; "
                    + " END IF; "
                    + "END;";

            st.execute(tquery);

            System.out.println("---Trigger create for before update----");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
