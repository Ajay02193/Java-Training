import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Dept {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Connection conn;
        PreparedStatement ps;
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");

             conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/saitm","root","5269");

             ps=conn.prepareStatement("INSERT INTO department VALUES(?,?,?)");

             System.out.println("Deartment_ID: ");
             int did= scn.nextInt();
             scn.nextLine();
             System.out.println("Department");
             String dept=scn.nextLine();
             System.out.println("Location");
             String loc=scn.nextLine();

             ps.setInt(1,did);
             ps.setString(2,dept);
             ps.setString(3,loc);

             ps.executeUpdate();

             ps=conn.prepareStatement("SELECT * FROM department");
             ResultSet rs = ps.executeQuery();

             while(rs.next()){
                 System.out.println("Department_ID: "+rs.getInt("Department_ID")+" | Department: "+rs.getString("Department")+" | Location: "+rs.getString("Location"));
             }



         }catch(Exception e){
             e.printStackTrace();

         }
    }
}
