package multithreading;

import java.util.concurrent.locks.Lock;

public class Bar implements Runnable{
    int count;
    Lock lock;
    public Bar(int n, Lock lock){
        this.count=n;
        this.lock=lock;

    }
    @Override
    public void run() {
        for(int i=0;i<count;i++) {
            lock.lock();
             System.out.println("bar");
             lock.unlock();
        }
    }
}
