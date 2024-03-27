import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapName {

    TreeMapName(){
        Scanner scn=new Scanner(System.in);
        TreeMap<String, Integer> nameAge=new TreeMap<>();       //TreeMap declaration

        //Storing values in TreeMap
        nameAge.put("Alice",19);
        nameAge.put("John",25);
        nameAge.put("Aman",20);
        nameAge.put("Ajay",23);
        nameAge.put("Bruce",17);

        System.out.println("Enter a name to search: ");     //Name to search list
        String search=scn.nextLine();

        if(nameAge.containsKey(search))     //searching name in Treemap
            System.out.println("Age of "+search+": "+nameAge.get(search));      //age of corresponding search

        else
            System.out.println("Name not found");
    }

    public static void main(String[] args) {
        new TreeMapName();
    }
}
