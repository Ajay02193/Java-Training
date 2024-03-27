import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scn.nextInt();
        System.out.println("Enter bit position: ");
        int n=scn.nextInt();
        int bitStatus=(num>>n)&1;
        if(bitStatus==1){
            System.out.println(n+" bit of "+num +" is set(1)");
        }
        else if(bitStatus==0){
            System.out.println(n+" bit of "+num +" is not set(1)");
        }
    }
}
