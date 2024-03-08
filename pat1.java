import java.util.*;
public class pat1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int d=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(i==n/2)
                    {
                       // System.out.print("  ");
                        continue;
                    }
                System.out.print("* ");}
            System.out.println();
        }
    }
    
}
