package Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        boolean login = false;
        do {
            System.out.println("User ID: ");
            String user = scn.nextLine();

            System.out.println("Password: ");
            String pass = scn.nextLine();

            try {
                StudentDBConn sdb = new StudentDBConn();

                PreparedStatement ps = sdb.c.prepareStatement("select * from login");
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                    if(rs.getString("userid").equals(user)&&rs.getString("password").equals(pass)){
                        login=true;
                        System.out.println("Successful login");
                    }
                    else
                        System.out.println("Wrong Credentials");
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }while(!login);
    }
}
