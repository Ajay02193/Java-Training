import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CustomerInsert {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        try{

            //Loding Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connection Establishment
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/saitm","root","5269");

            //Getting input to store data in table
            System.out.println("Customer_ID: ");
            int cid=scn.nextInt();
            scn.nextLine();
            System.out.println("First_Name: ");
            String fn=scn.nextLine();
            System.out.println("Last_Name: ");
            String ln=scn.nextLine();

            //Creating Statement to perform insert operation
            PreparedStatement ps= c.prepareStatement("Insert into customer Values('"+cid+"','"+fn+"','"+ln+"')");

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
