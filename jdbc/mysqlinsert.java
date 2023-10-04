import java.sql.*;

class mysqlinsert {
    public static void main(String args[]) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");
            Statement stmt = conn.createStatement();
            System.out.println("Inserting records into the table...");

            String sql = "insert into student values(1,'Anmol','Saharanpur')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO student VALUES(2,'Sahil','Noida')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO student VALUES(3,'Himanshi','Sonipat')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO student VALUES(4,'Alice','Delhi')";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table");
            conn.close();
        } catch (SQLException e) {

        }
    }
}