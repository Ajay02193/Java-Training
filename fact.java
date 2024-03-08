import java.util.Scanner;

public class fact {
    public int facto(int a){
        int res=1;
        for(int i=1;i<=a;i++)
            res=res*i;
        return res;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        fact obj =new fact();
        System.out.println("Result: "+obj.facto(n));
    }
    
}
