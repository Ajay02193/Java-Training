public class SquareThread extends Thread{
    synchronized public void run(){

        int[] arr = {1, 20, 50, 15, 30};

        System.out.println("Squares of numbers in the array: ");

        for(int i:arr){
            System.out.println("Square of "+i+": "+i*i);
        }
    }
}
