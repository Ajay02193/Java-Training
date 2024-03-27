import java.util.HashMap;
import java.util.Scanner;

public class Contact {
    Contact(){
        Scanner scn = new Scanner(System.in);
        String name;
        Long number;
        int ch;
        HashMap<String, Long> contact=new HashMap<>();      //HashMap Declaration
        do{
            System.out.println("\n1. Find Number \n2. Add Number \n3. Exit");
            ch=scn.nextInt();       //Choice input
            if(ch==1)
            {
                System.out.println("Enter name to find number: ");
                scn.nextLine();
                name=scn.nextLine();
                if(contact.containsKey(name))       //Checking if name exists in contact list or not
                    System.out.println("Phone no. of "+name+": "+contact.get(name));        //Diplaying the corresponding details from contact list
                else
                    System.out.println("Contact doesn't exists");
            }
            else if(ch==2)
            {
                System.out.println("Enter Name: ");     //name of new contact
                scn.nextLine();
                name=scn.nextLine();
                System.out.println("Enter Number.: ");      //new contact no. to be stored
                number=scn.nextLong();
                contact.put(name,number);
            }
            else if(ch==3)      //exit
                System.exit(0);
            else
                System.out.println("Invalid Input");
        }while(ch!=3);
    }

    public static void main(String[] args) {
        new Contact();
    }
}
