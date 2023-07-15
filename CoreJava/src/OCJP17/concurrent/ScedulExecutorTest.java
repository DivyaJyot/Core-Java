package OCJP17.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ScedulExecutorTest {
	static int x = 10;
	static Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		ScheduledExecutorService s = Executors.newScheduledThreadPool(3);
		//s.schedule(()-> doJob(), 1, TimeUnit.SECONDS);
		//s.scheduleAtFixedRate(() -> doJob(), 0, 10, TimeUnit.SECONDS);
		s.scheduleWithFixedDelay(() -> doJob(), 0, 10, TimeUnit.SECONDS);
		
	}

	private static void doJob() {
		
		if (lock.tryLock()) {
			x++;
			lock.unlock();
		}
		System.out.println(x);
	}

}
