import java.util.Scanner;

public class StrongNum {
    static void checkStrong(int num){
     int rem=0;
     int val=num;
     int fact;
     int res=0;

     while(val>0){
         rem=val%10;
         val=val/10;
         fact=1;
         for(int i=1;i<=rem;i++){
             fact*=i;
         }
         res+=fact;
     }
     if(res==num)
         System.out.println(num+" is a Strong Number");
     else
         System.out.println(num+" is not a Strong Number");
    }

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int num=scn.nextInt();
        checkStrong(num);
    }
}
