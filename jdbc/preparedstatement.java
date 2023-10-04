/*
 * program to use prepared statement in jdbc
 */
import java.sql.*;
import java.util.Scanner;

public class preparedstatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");

            if (conn != null) {
                System.out.println("Connection Establised");
            } else {
                System.out.println("Connection Failed");
            }

            System.out.print("Enter the Name: ");
            String name=sc.next();
            System.out.print("Enter the roll: ");
            int id=sc.nextInt();
            
            String query="Insert into student values(?,?)";

            PreparedStatement pstmnt = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmnt.setString(1,name);
            pstmnt.setInt(2,id);

            int i=pstmnt.executeUpdate();
            System.out.println(i+" Row Updated");

            ResultSet rs=pstmnt.executeQuery("Select * from student");
            rs.last();
            System.out.println(rs.getString(1)+" "+rs.getInt(2));

            pstmnt.close();
            conn.close();
            sc.close();


        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
