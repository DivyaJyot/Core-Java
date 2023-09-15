package multithreading;

import java.util.concurrent.Semaphore;

public class OddThread implements Runnable{
    Semaphore seven;
    Semaphore sOdd;
    boolean isEven;

    public OddThread(Semaphore sOdd,Semaphore seven){
        this.sOdd=sOdd;
        this.seven=seven;
    }
    @Override
    public void run() {
        for(int i=1;i<100;i+=2){
            try {
                sOdd.acquire();
                System.out.println(i);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            finally {
                seven.release();
            }

        }

    }
}
