public class Main {
    public static void main(String[] args) {
        System.out.println("Object B");
        B b=new B();
        b.f1();
        b.f2();
        System.out.println("Object C");
        C c=new C();
        c.f1();c.f2();c.f3();
    }
}
