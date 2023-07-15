package multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Thread2 implements Runnable{
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Thread2 (String name)
	{
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		FileWriter fw = null;
		try {
			System.out.println("\n"+getName()+"  started:");
			fw= new FileWriter("C:\\Users\\Divya\\eclipse-workspace\\TBasket\\CoreJava\\src\\multithreading\\text",true);
			fw.write("\n \tcall from thread2 ---current time is: "+(int) System.currentTimeMillis());
			System.out.println(getName()+"  finished:");
			Queue q= new ArrayBlockingQueue(10);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	
		
	}

}
