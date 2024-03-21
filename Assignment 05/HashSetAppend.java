import java.util.HashSet;

public class HashSetAppend {
    public static void main(String[] args) {
        HashSet<String> fruits= new HashSet();
        fruits.add("banana");
        fruits.add("date");
        fruits.add("cherry");

        System.out.println("Original HashSet: "+fruits);

        fruits.add("apple");

        System.out.println("Appended HashSet: "+fruits);
    }
}
