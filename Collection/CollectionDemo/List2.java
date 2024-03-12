package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class List2 {
    public void fun(){
        ArrayList list=new ArrayList();

        System.out.println("\n\nArrayList:"+list);

        for(int i=1;i<=10;i++)
            list.add(i);
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            Integer n=(Integer) itr.next();
            if(n%2==0){
                System.out.println(n);
            }
        }
    }

}
