import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        char ch=scn.next().charAt(0);
        switch (ch) {
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;
            case '*':System.out.println(a*b);
                break;
            case '/':System.out.println(a/b);
                break;
        
            default:System.out.println("INVALID INPUT");
                break;
        }
        scn.close();
    }
    
}
