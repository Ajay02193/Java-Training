import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        try{
            Scanner scn = new Scanner(System.in);

            //Loading Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connection Establishment
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/saitm", "root", "5269");

            //Taking input from the user
            System.out.println("Enter EID: ");
            int eid=scn.nextInt();
            scn.nextLine();
            System.out.println("Enter Name:");
            String name = scn.nextLine();
            System.out.println("Enter Address:");
            String add = scn.nextLine();
            System.out.println("Enter Salary:");
            int salary = scn.nextInt();

            //preparing statement to execute insertion
            PreparedStatement ps = c.prepareStatement("insert into Employee  values (?, ?, ?, ?)");

            ps.setInt(1,eid);
            ps.setString(2, name);
            ps.setString(3, add);
            ps.setInt(4, salary);

            int i = ps.executeUpdate();     //executing update
            if (i == 1)
                System.out.println("Employee Inserted Successfully");
            else
                System.out.println("Employee Insertion Unsuccessful ");

        }catch (Exception e){
            e.getMessage();
        }
    }
}
