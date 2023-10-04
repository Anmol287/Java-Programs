import java.sql.*;
import java.util.Scanner;

public class concurupdate {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");
            if (conn != null) {
                System.out.println("Connection Established\n");
            } else {
                System.out.println("Connection to database is failed");
            }
            String sqlquery = "Select * from emp";

            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(sqlquery);
        
            Scanner sc = new Scanner(System.in);

            int row = -1;
            String answer;
           while (row != 0) {
                rs.last();
                int i=rs.getRow();
                System.out.println("Totals rows "+i);
                
                System.out.println("\n\nEnter the row number ");
                row = sc.nextInt();
                rs.absolute(row);
                System.out.println("Record at " + row + " th is " + rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));

                System.out.println("Do you want to Insert record after this row ? (Y/N)");
                answer = sc.next();
//inserting
                if(answer.equalsIgnoreCase("y")) {
                    // update
                    System.out.print("Enter the Employee number "); int empno=sc.nextInt();
                    System.out.print("Enter the Dept Name "); String dept=sc.next();
                    System.out.print("Enter the Salary "); int empsal=sc.nextInt();

                    rs.moveToInsertRow();
                    rs.updateInt(1, empno);
                    rs.updateString(2, dept);
                    rs.updateInt(3, empsal);
                    rs.insertRow();
                    //rs.moveToCurrentRow();
                    rs.last();
                    System.out.println("Recored inserted ");
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
                }
//updating
                System.out.println("Do you want to Update this row ? (Y/N)");
                answer = sc.next();
                if(answer.equalsIgnoreCase("y")) {
                    // update
                    System.out.print("Enter the Employee number "); int empno=sc.nextInt();
                    System.out.print("Enter the Dept Name "); String dept=sc.next();
                    System.out.print("Enter the Salary "); int empsal=sc.nextInt();

                    rs.updateInt(1, empno);
                    rs.updateString(2, dept);
                    rs.updateInt(3, empsal);
                    rs.updateRow();
                    //rs.moveToCurrentRow();
                    rs.getRow();
                    System.out.print("Recored Updated..New Record is  ");
                    System.out.print(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
                }

//deleting
                System.out.println("Do you want to Delete this record row ? (Y/N)");
                answer = sc.next();
                if(answer.equalsIgnoreCase("y")) {
                    rs.deleteRow();
    
                    System.out.print("Recored Delete ");
                    System.out.println(rs.getRow());
                }

                else{
                    break;
                }
                System.out.println("Program Ended \n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
