import java.util.concurrent.locks.*;

public class Test implements Runnable{
    int n=1;

    Lock lock;
    Test(Lock lock){
        this.lock=lock;
    }
    public void run(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+" : "+(n++));
        lock.unlock();
    }
}
