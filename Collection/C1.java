import java.util.*;

public class C1 {

    void ArrayFun(){
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList<String> list3=new ArrayList();

        list1.add("ABC");
        list2.add("DEF");
        list3.add("GHI");

        list1.addAll(list2);
        list2.addAll(list3);
        list1.addAll(list2);

        System.out.println("list1: "+list1);
        System.out.println("list2: "+list2);
        System.out.println("list3: "+list3);


        HashSet set1=new HashSet();
        HashSet set2=new HashSet();
        HashSet set3=new HashSet();

        set1.add("ABC");
        set2.add("DEF");
        set3.add("GHI");

        set1.addAll(set2);
        set2.addAll(set3);
        set1.addAll(set2);

        System.out.println("set1: "+set1);
        System.out.println("set2: "+set2);
        System.out.println("set3: "+set3);

        LinkedHashSet<String> lhs =new LinkedHashSet<>();
        lhs.add("B");
        lhs.add("A");
        lhs.add("D");
        lhs.add("E");
        lhs.add("B");
        System.out.println("LinkedHashSet: "+lhs);

        HashSet<String> hs=new HashSet<>();
        hs.add("A");
        hs.add("C");
        hs.add("B");
        hs.add("A");
        System.out.printf("HashSet: "+hs);

        HashSet<String> hst=new HashSet<>();
        LinkedHashSet<String> lhst = new LinkedHashSet<>();

        hst.add("apple");
        hst.add("banana");
        hst.add("Orange");

        lhst.add("apple");
        lhst.add("banana");
        lhst.add("Orange");

        System.out.println("\nHashSet: ");
        for(String fruit: hst)
            System.out.print("  "+fruit);

        System.out.println("\nLinkedHashSet: ");
        for(String fruit: lhst)
            System.out.print("  "+fruit);

    }

    public static void main(String[] args) {
        C1 c=new C1();
        c.ArrayFun();
    }
}
