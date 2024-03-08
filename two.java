public class two{
    static int a=10; 
    void fun(){
        int b=20;
        System.out.println(a+" "+b);
        a++;
        b++;
    }
    public static void main(String args[]){
        two obj=new two();
        obj.fun();
        obj.fun();
    }
}
