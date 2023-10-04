/*
 * program to create connection to database in jdbc
 * 
 * @Author: Anmol Kansal
 */

import java.sql.*;

public class connection {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");

            if (conn != null) {
                System.out.println("Connection is Established ");
            } else {
                System.out.println("Connection Failed");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
