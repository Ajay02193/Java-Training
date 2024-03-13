package CollectionDemo;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public void fun(){
        Queue<String>q = new LinkedList<>();

        q.add("A");
        q.add("B");
        q.add("C");
        System.out.println("\n\nQueue"+q);
        q.remove();
        System.out.println(q);
        q.remove();
        System.out.println(q);

    }
}
