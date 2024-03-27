public class AverageThread extends Thread{
    synchronized public void run(){
        float sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println("The average of first 10 numbers is "+sum/10);
    }
}
