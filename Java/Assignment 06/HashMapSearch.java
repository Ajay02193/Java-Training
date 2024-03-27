import java.util.HashMap;

public class HashMapSearch {
    public static void main(String[] args) {
        HashMap<String, Integer> cricketer = new HashMap<>();     //HashMap declaration

        //Inserting values to HashMap
        cricketer.put("Rohit Sharma",89);
        cricketer.put("Virat Kohli",98);
        cricketer.put("MS Dhoni",102);
        cricketer.put("Jasprit Bumrah",85);
        cricketer.put("Sachin Tendulkar",99);
        cricketer.put("Rishab Pant",65);

        //Storing name of Cricketer in search String
        String search="Rohit Sharma";

        System.out.println(search+"'s score: "+cricketer.get(search));      //Displaying score of the specific cricketer

    }
}
