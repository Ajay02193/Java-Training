import java.util.Scanner;

public class arrloop1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=0;
        if(n%2==0)
            m=n/2;
        else
            m=n/2+1;
        int[] odd=new int[m];
        int[] even=new int[n-m];
        int e=0,o=0;
        for(int i=1;i<=n;i++){
            if(i%2==0)
                {
                    even[e]=i;
                    e++;
                }
            else
            {
                odd[o]=i;
                o++;
            }
        }
        System.out.println("Even ");
        for(int i=0;i<n-m;i++)
            System.out.println(even[i]);
        System.out.println("Odd ");
        for(int i=0;i<m;i++)
            System.out.println(odd[i]);
    scn.close();
    } 
}
