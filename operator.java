public class operator {
    public static void main(String[] args){
        int a=10,b=20;
        System.out.println(a+" "+b);
        System.out.println("a+b: "+(a+b));
        System.out.println("a-b: "+(a-b));
        System.out.println("a*b: "+(a*b));
        System.out.println("b/a: "+(b/a));
        System.out.println("b%a: "+(b%a));
        a=2;b=3;
        System.out.println(a+" "+b);
        if(a%2==0)
            System.out.println(" EVEN a ");
        else
            System.out.println(" ODD a");
        if(b%2!=0)
            System.out.println(" ODD b");
        else
            System.out.println(" EVEN b");
        if(a==2&&b==3)
            System.out.println(" AND");
        if(a==2||b==2)
            System.out.println(" OR ");
    }
}
