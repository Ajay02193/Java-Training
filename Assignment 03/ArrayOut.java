import java.util.Scanner;

public class ArrayOut {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Size of array: ");
        int size= scn.nextInt();
        int[] arr= new int[size];
        try{for(int i=0;i<size;i++)
            arr[i]=i+1;
            for(int i=0;i<=size;i++)
                System.out.println("Element at index "+i+": "+arr[i]);
        }catch(ArrayIndexOutOfBoundsException aoe){
            System.out.println("Error: Array Index Out Of Bound");
        }
    }
}
