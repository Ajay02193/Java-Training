
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Car> pq=new PriorityQueue<>();
        pq.add(new Car(25,500));
        pq.add((new Car(35,650)));
        pq.add(new Car(15,400));
        pq.add(new Car(20,700));

        while(!pq.isEmpty())
        {
            System.out.println(pq.poll());
        }
    }
}
