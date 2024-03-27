import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CustomerUpdate {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        try{
            //Loding Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connection Establishment
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/saitm","root","5269");

            //Getting input to store data in table
            System.out.println("cid: ");
            int cid=scn.nextInt();
            scn.nextLine();
            System.out.println("email: ");
            String email=scn.nextLine();

            //Creating Statement to perform update operation
            PreparedStatement ps= c.prepareStatement("update customer set email='"+email+"'where cid='"+cid+"'");

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
