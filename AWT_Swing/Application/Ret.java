package Application;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ret {
    public static void main(String[] args) {

        try{
            Conn conn =new Conn();
            String query="select * from student";

            PreparedStatement ps =conn.c.prepareStatement(query);
            ResultSet rs=ps.executeQuery();

            while(rs.next()) {
                System.out.printf("formno: %s | name: %s | fname: %s | dob: %s | gender: %s | email: %s | mop: %s | address: %s | city: %s | state: %s | pincode: %s %n%n",
                        rs.getString("formno"),
                        rs.getString("name"),
                        rs.getString("fname"),
                        rs.getString("dob"),
                        rs.getString("gender"),
                        rs.getString("email"),
                        rs.getString("mop"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getString("state"),
                        rs.getString("pincode"));
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}
