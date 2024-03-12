import java.util.ArrayList;
import java.util.HashSet;

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
    }
}
