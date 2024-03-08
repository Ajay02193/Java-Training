import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println("Odd no. b/w 1 to "+n);
        for(int i=1;i<=n;i++){
            if(i%2!=0)
                System.out.println(i);
        }
        System.out.println("Even no. b/w 1 to "+n);
                for(int i=1;i<=n;i++){
                    if(i%2==0)
                        System.out.println(i);
                }
        scn.close();
    }
    
}
