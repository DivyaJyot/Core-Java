package multithreading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread(new Thread1("first tthread1"));
		t1.start();
		Thread t12= new Thread(new Thread1("first tthread12"));
		t12.start();
		Thread t13= new Thread(new Thread1("first tthread13"));
		t13.start();
		Thread t2= new Thread(new Thread2("Thread2"));
		t2.start();
		System.out.println("Done");

	}

}
