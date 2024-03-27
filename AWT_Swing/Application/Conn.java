package Application;

import java.sql.*;

public class Conn {

    Connection c;

    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/demos","root","5269");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}