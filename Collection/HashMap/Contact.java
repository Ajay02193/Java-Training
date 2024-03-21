import java.util.HashMap;
import java.util.Scanner;

public class Contact {
    public void fun(){
        Scanner scn = new Scanner(System.in);
        String name;
        Long number;
        int ch;
        HashMap<String, Long> contact=new HashMap<>();
        do{
            System.out.println("\n1. Find Number \n2. Add Number \n3. Exit");
            ch=scn.nextInt();
            if(ch==1)
            {
                System.out.println("Enter no. to find");
                number=scn.nextLong();
                if(contact.containsValue(number))
                    System.out.println("No. exists");
                else
                    System.out.println("No. doesn't exists");
            }
            else if(ch==2)
            {
                System.out.println("Enter Name: ");
                scn.next();
                name=scn.nextLine();
                System.out.println("Enter Nu.: ");
                number=scn.nextLong();
                contact.put(name,number);
            }
            else if(ch==3)
                System.exit(0);
            else
                System.out.println("Invalid Input");
        }while(ch!=3);


    }
}
