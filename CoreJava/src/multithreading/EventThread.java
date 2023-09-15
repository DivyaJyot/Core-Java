package multithreading;

import java.util.concurrent.Semaphore;

public class EventThread implements Runnable{
    Semaphore seven;
    Semaphore sOdd;
    boolean isEven;
    public EventThread(Semaphore sOdd,Semaphore seven){
        this.sOdd=sOdd;
        this.seven=seven;

    }
    @Override
    public void run() {
        for(int i=0;i<100;i+=2){
            try {
                seven.acquire();
                System.out.println(i);
                isEven=false;
            }
            catch(Exception e){
                e.printStackTrace();
            }
            finally {
                sOdd.release();
            }
        }
    }
}
