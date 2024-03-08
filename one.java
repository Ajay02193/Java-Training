public class one{
    int b=20; // instance variable
    static int c=30; // static variable
    public static void main(String args[]){
        int a=10; // local variable
        one n=new one(); //object
        System.out.println(a);
        System.out.println(n.b);
        System.out.println(one.c);
    }
}
