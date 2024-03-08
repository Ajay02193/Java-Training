import java.util.Scanner;

public class cont {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
            arr[i]=scn.nextInt();
        for(int i=0;i<arr.length;i++)
            {
                if(i==5)
                    continue;
                System.out.println(arr[i]);
            }
    }
}
