import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.*;
public class Main {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(100);
        Lock lock = new ReentrantLock();
        Test t = new Test(lock);
        for(int i =0;i<100;i++){
            Thread th = new Thread(t);
            //th.start();
            es.submit(th);
        }
    }
}
