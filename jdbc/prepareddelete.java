import java.sql.*;
// import java.util.Scanner;
public class prepareddelete {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
       
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");

            if (conn != null) {
                System.out.println("Connection Establised");
            } else {
                System.out.println("Connection Failed");
            }
            String query="Delete from student where roll= ?";
            //String query1="insert into student values (?,?)";
            PreparedStatement pstmnt = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //pstmnt.setString();
           // pstmnt.setString(1,"Himanshi");
            pstmnt.setInt(1,15);
            pstmnt.addBatch();
            //pstmnt.setString(1,"Vinita");
            pstmnt.setInt(1,16);
            pstmnt.addBatch();

           int i[]= pstmnt.executeBatch();
           System.out.println(i.length+" Row Updated");
           

            // ResultSet rs=pstmnt.executeQuery("Select * from student");
            // rs.last();
            // System.out.println(rs.getString(1)+" "+rs.getInt(2));
            
            pstmnt.close();
            conn.close();

        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
