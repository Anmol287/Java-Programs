import java.sql.*;


public class scrollableresultset {
    public static void main(String[] args){
        try {
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");
            
            if(conn!=null){
                System.out.println("Connection Establised");
            }
            else{
                System.out.println("Connection Failed");
            }

            Statement st= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs= st.executeQuery("Select * from student1");
            ResultSetMetaData rs1 = rs.getMetaData();
            System.out.println(rs1.getColumnName(1)+"  "+ rs1.getColumnName(2)+"  "+rs1.getColumnName(3));
        
            rs.absolute(3);
            System.out.println(rs.getInt(1)+"     "+rs.getString(2)+"   "+rs.getInt(3));
            rs.relative(-1);
            System.out.println(rs.getInt(1)+"     "+rs.getString(2)+"   "+rs.getInt(3));
            rs.last();
            System.out.println(rs.getInt(1)+"    "+rs.getString(2)+" "+rs.getInt(3));
            

        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
