import GenericsDemo.Box;
import GenericsDemo.Box2;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Box");
        Box b1=new Box("CON");
        b1.container=(123);
        System.out.println(b1.getContainer());

        Box b2=new Box(123);
        System.out.println(b2.getContainer());

        System.out.println("\n***Box2");
        Box2<String> bx1 =new Box2("CON");
        //bx1.container=(123);
        bx1.container=("ABC");
        System.out.println(bx1.getContainer());

        Box2<Integer> bx2=new Box2(123);
        bx2.container=(456);
        System.out.println(bx2.getContainer());



    }
}
