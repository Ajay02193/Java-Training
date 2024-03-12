package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {
    public void fun(){
        List<String> list=new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println("list: "+list);
        Iterator itr=list.iterator();

        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
