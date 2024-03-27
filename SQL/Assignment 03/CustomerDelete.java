import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CustomerDelete {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        try{
            //Loding Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connection Establishment
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/saitm","root","5269");

            //getting customer id to delete data
            System.out.println("cid: ");
            int cid=scn.nextInt();

            //Creating Statement to delete data
            PreparedStatement ps= c.prepareStatement("delete from customer where cid='"+cid+"'");

            //Executing Update
            if((ps.executeUpdate())>0)
                System.out.println("Success");
            else
                System.out.println("Unsuccessful");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
