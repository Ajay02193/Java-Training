import java.sql.*;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in);
             Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/saitm", "root", "5269")) {
            char ch;
            int choice;
            do {
                System.out.println("1. Create Employee table");
                System.out.println("2. Insert in Employee table");
                System.out.println("3. Display Data");
                System.out.println("4. Delete Table");
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
                    case 4:
                        deleteEmployeeTable(c);
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

    public static void createEmployeeTable(Connection c) throws SQLException {
        try (PreparedStatement ps = c.prepareStatement("show tables");
             ResultSet rs = ps.executeQuery()) {

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
        }
    }

    public static void insertEmployeeData(Connection c, Scanner scn) throws SQLException {
//        System.out.println("Enter Employee ID:");
//        int eid = scn.nextInt();
        scn.nextLine();
        System.out.println("Enter Name:");
        String name = scn.nextLine();
        System.out.println("Enter Address:");
        String add = scn.nextLine();
        System.out.println("Enter Salary:");
        int salary = scn.nextInt();

        try (PreparedStatement ps = c.prepareStatement("insert into Employee (Name, Address, Salary) values ( ?, ?, ?)")) {
//            ps.setInt(1, eid);
            ps.setString(1, name);
            ps.setString(2, add);
            ps.setInt(3, salary);

            int i = ps.executeUpdate();
            if (i == 1)
                System.out.println("Successful Insertion");
            else
                System.out.println("Unsuccessful Insertion");
        }
    }

    public static void displayEmployee(Connection c) throws SQLException {
        try(PreparedStatement ps = c.prepareStatement("select * from Employee")){
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println("Employee_ID: "+rs.getInt("E_Id")+" | Name: "+rs.getString("Name")+" | Address: "+rs.getString("Address")+" | Salary: "+rs.getInt("Salary"));
            }
        }
    }


    public static void deleteEmployeeTable(Connection c) throws SQLException {
        try (PreparedStatement ps = c.prepareStatement("show tables");
             ResultSet rs = ps.executeQuery()) {

            boolean te = false;
            while (rs.next()) {
                if (rs.getString("Tables_in_saitm").equalsIgnoreCase("Employee")) {
                    te = true;
                    try (Statement stmt = c.createStatement()) {
                        int i = stmt.executeUpdate("drop table Employee");
                        if (i == 0)
                            System.out.println("Successful Deletion");
                        else
                            System.out.println("Unsuccessful");
                    }
                }
            }

            if (!te)
                System.out.println("Table doesn't exist");
        }
    }
}
