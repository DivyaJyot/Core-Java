package multithreading;

import java.util.concurrent.Semaphore;

public class BarNew implements Runnable {
    Semaphore sFoo;
    Semaphore sBar;

    int count = 30;

    public BarNew(Semaphore sFoo, Semaphore sBar) {
        this.sFoo = sFoo;
        this.sBar = sBar;
    }

    @Override
    public void run() {
        try {
            while (count > 0) {
                sBar.acquire();
                System.out.println("Bar");
                count--;
                sFoo.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
