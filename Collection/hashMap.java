import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(2,"D");
        map.put(3,"E");

        System.out.println("map: "+map);
        System.out.println("map.keySet(): "+map.keySet());
        Set set = map.entrySet();
        System.out.println("map.entrySet(): "+set);
        System.out.println("\niterator() method: ");
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Map.Entry: ");
        System.out.println("mentry.getKey() ==> mentry.getValue()");
        Iterator itr1=map.entrySet().iterator();
        while(itr1.hasNext()){
            Map.Entry mentry =(Map.Entry)itr1.next();
            System.out.println((mentry.getKey())+" ==> "+mentry.getValue());
        }

        System.out.println("========================================================");
        System.out.println("mentry.getKey() ==> mentry.getValue(): using map.entrySet()");
        for(Map.Entry mapentry :map.entrySet())
            System.out.println(mapentry.getKey()+" ==> "+mapentry.getValue());

        map.remove(1);
        System.out.println("map.remove(1) -> map: "+map);
        System.out.println("map.containskey(1): "+map.containsKey(1));
        System.out.println("map.containskey(2): "+map.containsKey(2));
        System.out.println("map.containsValue("+"A"+"): "+map.containsValue("A"));
        System.out.println("map.containsValue("+"B"+"): "+map.containsValue("B"));
        System.out.println("map.containsValue("+"D"+"): "+map.containsValue("D"));

    }
}
