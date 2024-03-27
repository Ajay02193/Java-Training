import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LogTable {
    public static void main(String[] args) {
        try{
            //Loading Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connection Establishment
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/saitm", "root", "5269");

            Statement s= c.createStatement();

            // Define the SQL statement to create a trigger
            String createTriggerSQL= "CREATE TRIGGER change_date " +"AFTER UPDATE ON Salary_Log "+"FOR EACH ROW "+"BEGIN"+" SET NEW.change_date = NOW(); "+"END;";

            // Execute the SQL statement to create the trigger
            s.executeUpdate(createTriggerSQL);
            System.out.println("Trigger created successfully.");

        }catch (Exception e){
            e.getMessage();
        }
    }
}
