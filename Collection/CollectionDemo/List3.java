package CollectionDemo;

import java.util.LinkedList;
import java.util.List;

public class List3 {

    public void fun(){
        List list=new LinkedList();

        for(int i=1;i<=10;i++)
            list.add(i*2);
        System.out.println("\n\nLinked List: "+list);

        System.out.println(list.size());

    }

}
