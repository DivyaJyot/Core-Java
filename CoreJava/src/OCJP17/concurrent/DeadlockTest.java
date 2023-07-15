package OCJP17.concurrent;

public class DeadlockTest {
	
	public static void go() {
		final String ransom= "Ransom";
		final String hostage= "Hostage";
		Thread criminals= new Thread(()->{
		synchronized(ransom){
			System.out.println("Thief has Ransom but need hostage");
		}
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	});
		Thread police= new Thread(() -> {
			synchronized(hostage){
				System.out.println("Thief has hostage but need ransom");
			}
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
	
	}
}
