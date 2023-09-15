package multithreading;

import java.util.concurrent.Semaphore;

public class FooBarNew {



    public static void main(String[] args) {
        Semaphore sFoo= new Semaphore(1);
        Semaphore sBar= new Semaphore(0);
        Thread t1= new Thread(new Foonew(sFoo,sBar));
        Thread tw2= new Thread(new BarNew(sFoo,sBar));
        t1.start();
        tw2.start();


    }
}
