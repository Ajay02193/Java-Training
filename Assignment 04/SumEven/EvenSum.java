import java.util.ArrayList;
import java.util.Iterator;

public class EvenSum {
    void fun(){
        ArrayList list = new ArrayList();
        int sum=0;

        list.add(2);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(15);

        Iterator itr= list.iterator();

        while(itr.hasNext()){
            Integer n=(Integer) itr.next();
            if(n%2==0)
                sum+=n;
        }

        System.out.println("Sum of all even elements in ArrayList is "+sum);
    }
}
