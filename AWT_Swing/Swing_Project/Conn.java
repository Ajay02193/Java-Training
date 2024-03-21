package Swing_Project;

import javax.swing.*;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/demos","root","5269");
            s=c.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Database Connection Failed");
        }
    }
}
