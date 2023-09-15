package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FooBar {
    private int n;
    private Lock lock = new ReentrantLock();
    int counter = 1;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized(this) {
                // printFoo.run() outputs "foo". Do not change or remove this line.
                while (counter != 1)
                    wait();
                if (counter == 1) {
                    printFoo.run();
                    counter = 2;
                    notify();
                }
            }
        }
    }


    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized(this) {
                while (counter != 2)
                    wait();
                // printBar.run() outputs "bar". Do not change or remove this line.

                if (counter == 2) {
                    printBar.run();
                    counter = 1;
                    notify();

                }
            }
        }

    }
}