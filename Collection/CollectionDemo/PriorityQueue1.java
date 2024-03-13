package CollectionDemo;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public void fun(){
        PriorityQueue<Integer> pq=new PriorityQueue();

        pq.add(5);
        pq.add(4);
        pq.add(6);
        pq.add(1);
        pq.add(10);
        System.out.println("\n\nminHeap:");
        while(!pq.isEmpty())
            System.out.print(" "+pq.poll());


        PriorityQueue<Integer> pqm=new PriorityQueue<>((a,b)-> b-a);

        pqm.add(5);
        pqm.add(4);
        pqm.add(6);
        pqm.add(1);
        pqm.add(10);
        System.out.println("\nmaxHeap:");
        while(!pqm.isEmpty())
            System.out.print(" "+pqm.poll());


    }
}
