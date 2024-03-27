import java.util.HashMap;

public class HashMapEmpty {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();     //HashMap declaration

        //HashMap data store
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);

        System.out.println("Is the HashMap empty?: "+hashMap.isEmpty());        //Checking and displaying whether HashMap isEmpty or not

        hashMap.clear();        //deleting HashMap elements

        System.out.println("Is the HashMap is empty after clearing?:  "+hashMap.isEmpty());         //Checking and displaying whether HashMap isEmpty or not after deleting elements
    }
}
