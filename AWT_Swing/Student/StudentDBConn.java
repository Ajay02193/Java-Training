package Student;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentDBConn {
    public static Connection c;

    public StudentDBConn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/demos","root","5269");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
