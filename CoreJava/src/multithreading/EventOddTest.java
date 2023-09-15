package multithreading;

import java.util.concurrent.Semaphore;

public class EventOddTest {
    static boolean iseven=true;
    public static void main(String[] args) {
        Semaphore evens= new Semaphore(1);
        Semaphore odds= new Semaphore(0);
        Thread t1= new Thread(new OddThread(odds,evens));
        Thread t2= new Thread(new EventThread(odds,evens));
        t1.start();
        t2.start();
    }
}
