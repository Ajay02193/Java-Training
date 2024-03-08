public class Main {
    public static void main(String[] args) {
        B b=new B();
        b.fun();
        b.sfun();

        A a=new A();
        a.fun();
        a.sfun();       //A.sfun

        A ab;
        ab=new B();
        ab.fun();       //B.fun because non use of static method
        ab.sfun();  //A.sfun because use of static variable which doesn't doesn't need to get accessed through its objects
    }
}
