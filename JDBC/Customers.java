import java.sql.*;
import java.util.Scanner;

public class Customers {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/saitm","root","5269");

            System.out.println("Customer_ID: ");
            int cid=scn.nextInt();
            scn.nextLine();
            System.out.println("First_Name: ");
            String fn=scn.nextLine();
            System.out.println("Last_Name: ");
            String ln=scn.nextLine();

            PreparedStatement ps= c.prepareStatement("Insert into Customers Values('"+cid+"','"+fn+"','"+ln+"')");
            if((ps.executeUpdate())>0)
                System.out.println("Success");
            else
                System.out.println("Unsuccessful");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
