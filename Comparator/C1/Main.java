
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Car> pqs=new PriorityQueue<>(new SpeedComparator());
        pqs.add(new Car(25,500,"A"));
        pqs.add((new Car(35,650,"C")));
        pqs.add(new Car(15,400,"D"));
        pqs.add(new Car(20,700,"B"));
        System.out.println("Based on speed(Ascending Order): ");
        while(!pqs.isEmpty())
        {
            System.out.println(pqs.poll());
        }

        PriorityQueue<Car> pqp=new PriorityQueue<>(new PowerComparator());
        pqp.add(new Car(25,500,"A"));
        pqp.add((new Car(35,650,"C")));
        pqp.add(new Car(15,400,"D"));
        pqp.add(new Car(20,700,"B"));
        System.out.println("\nBased on power(Ascending Order): ");
        while(!pqp.isEmpty())
        {
            System.out.println(pqp.poll());
        }

        PriorityQueue<Car> pqn=new PriorityQueue<>(new NameComparator());
        pqn.add(new Car(25,500,"A"));
        pqn.add((new Car(35,650,"C")));
        pqn.add(new Car(15,400,"D"));
        pqn.add(new Car(20,700,"B"));
        System.out.println("\nBased on name(Ascending Order): ");
        while(!pqn.isEmpty())
        {
            System.out.println(pqn.poll());
        }

        PriorityQueue<Car> pqsd=new PriorityQueue<>(new SpeedComparatorDes());
        pqsd.add(new Car(25,500,"A"));
        pqsd.add((new Car(35,650,"C")));
        pqsd.add(new Car(15,400,"D"));
        pqsd.add(new Car(20,700,"B"));
        System.out.println("\nBased on speed(Descending Order): ");
        while(!pqsd.isEmpty())
        {
            System.out.println(pqsd.poll());
        }

        PriorityQueue<Car> pqpd=new PriorityQueue<>(new PowerComparatorDes());
        pqpd.add(new Car(25,500,"A"));
        pqpd.add((new Car(35,650,"C")));
        pqpd.add(new Car(15,400,"D"));
        pqpd.add(new Car(20,700,"B"));
        System.out.println("\nBased on power(Descending Order): ");
        while(!pqpd.isEmpty())
        {
            System.out.println(pqpd.poll());
        }

        PriorityQueue<Car> pqnd=new PriorityQueue<>(new NameComparatorDes());
        pqnd.add(new Car(25,500,"A"));
        pqnd.add((new Car(35,650,"C")));
        pqnd.add(new Car(15,400,"D"));
        pqnd.add(new Car(20,700,"B"));
        System.out.println("\nBased on name(Descending Order): ");
        while(!pqnd.isEmpty())
        {
            System.out.println(pqnd.poll());
        }
    }
}
