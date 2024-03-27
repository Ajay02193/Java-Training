import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapAge {

    TreeMapAge(){
        Scanner scn=new Scanner(System.in);
        TreeMap<String, Integer> nameAge=new TreeMap<>();       //TreeMap declaration

        //Storing values in TreeMap
        nameAge.put("Alice",19);
        nameAge.put("John",25);
        nameAge.put("Aman",20);
        nameAge.put("Ajay",23);
        nameAge.put("Bruce",17);

        System.out.println("Enter an age to search: ");     //Age to search in list
        int search=scn.nextInt();

        boolean found = false;
        for (Map.Entry<String, Integer> entry : nameAge.entrySet())     //loop to iterate through each element of TreeMap
        {
            if (entry.getValue() == search) {
                System.out.println("Name with age "+ search + ": " + entry.getKey());   //Displaying name of corresponding age
                found = true;
            }
        }

        if(!found)
            System.out.println("Age not found");
    }

    public static void main(String[] args) {
        new TreeMapAge();
    }
}
