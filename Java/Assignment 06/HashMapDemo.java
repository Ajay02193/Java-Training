import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();     //HashMap declaration

        //HashMap data store
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);

        System.out.println("Hashmap: "+hashMap);        //HashMap elements display key with values
    }
}
