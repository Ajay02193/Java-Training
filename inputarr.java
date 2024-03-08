import java.util.Scanner;
public class inputarr {
    public static void main(String[] args) {
     int[] arr=new int[10];
     Scanner scn = new Scanner(System.in);
      for(int i=0;i<10;i++)
        arr[i]=scn.nextInt();
      // for(int i: arr)
      for(int i=0;i<10;i++){
        if(i==5)
            break;
        System.out.println(arr[i]);
    }
     scn.close();
    }
}
