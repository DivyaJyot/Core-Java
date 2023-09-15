package multithreading;

import java.util.concurrent.Semaphore;

public class Foonew implements Runnable{
    Semaphore sFoo;
    Semaphore sBar;

    int count =30;

    public Foonew(Semaphore sFoo, Semaphore sBar) {
        this.sFoo = sFoo;
        this.sBar = sBar;
    }

    @Override
    public void run() {
        try{
        while(count>0){
            sFoo.acquire();
            System.out.println("Foo");
            count--;
            sBar.release();
        }}
        catch(Exception e){
                e.printStackTrace();
            }

    }

}
