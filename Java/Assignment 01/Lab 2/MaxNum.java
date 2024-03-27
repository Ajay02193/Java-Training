import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        int num1, num2;
        System.out.println("Num1: ");
        num1=scn.nextInt();
        System.out.println("Num2: ");
        num2=scn.nextInt();
        System.out.println("Maximum between "+num1+" and "+num2+" is: "+(num1>num2?num1:num2));
    }
}
