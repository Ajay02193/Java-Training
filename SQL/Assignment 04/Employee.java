import java.sql.*;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);

            //Loading Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connection Establishment
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/saitm", "root", "5269");

            System.out.println("Connection: "+c);
            char ch;
            int choice;
            do {
                //Options to create table, insert data in table, and displaying data
                System.out.println("1. Create Employee table");
                System.out.println("2. Insert in Employee table");
                System.out.println("3. Display Data");
                System.out.println("Enter from the above option to proceed: ");
                choice = scn.nextInt();

                switch (choice) {
                    case 1:
                        createEmployeeTable(c);
                        break;
                    case 2:
                        insertEmployeeData(c, scn);
                        break;
                    case 3:
                        displayEmployee(c);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

                System.out.println("Do you want to continue(y/n): ");
                ch = scn.next().charAt(0);
            } while (ch == 'y' || ch == 'Y');
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //method to create Employee table
    public static void createEmployeeTable(Connection c){
        try {
             PreparedStatement ps = c.prepareStatement("show tables");
             ResultSet rs = ps.executeQuery();

            boolean te = false;
            while (rs.next()) {
                if (rs.getString("Tables_in_saitm").equalsIgnoreCase("Employee")) {
                    System.out.println("Table already exists");
                    te = true;
                    break;
                }
            }

            if (!te) {
                try (Statement stmt = c.createStatement()) {
                    int i = stmt.executeUpdate("create table Employee (E_Id int primary key AUTO_INCREMENT, Name varchar(40) not null, Address varchar(80) not null, Salary int not null)");
                    if (i == 0)
                        System.out.println("Table created");
                    else
                        System.out.println("Unsuccessful");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //method to insert data in Employee table
    public static void insertEmployeeData(Connection c, Scanner scn) throws SQLException
    {
        scn.nextLine();
        System.out.println("Enter Name:");
        String name = scn.nextLine();
        System.out.println("Enter Address:");
        String add = scn.nextLine();
        System.out.println("Enter Salary:");
        int salary = scn.nextInt();

        try {
            PreparedStatement ps = c.prepareStatement("insert into Employee (Name, Address, Salary) values ( ?, ?, ?)");

            ps.setString(1, name);
            ps.setString(2, add);
            ps.setInt(3, salary);

            int i = ps.executeUpdate();
            if (i == 1)
                System.out.println("Successful Insertion");
            else
                System.out.println("Unsuccessful Insertion");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //method to display data of Employee table
    public static void displayEmployee(Connection c){
        try{
            PreparedStatement ps = c.prepareStatement("select * from Employee");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println("Employee_ID: "+rs.getInt("E_Id")+" | Name: "+rs.getString("Name")+" | Address: "+rs.getString("Address")+" | Salary: "+rs.getInt("Salary"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
