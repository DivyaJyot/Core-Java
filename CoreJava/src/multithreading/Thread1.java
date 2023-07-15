package multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;

public class Thread1 implements Runnable{
	
	private String name;
	public static int count=0;
	public static Object o = new Object();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Thread1 (String name)
	{
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		synchronized(o) {
		try {
			System.out.println("\n"+getName()+"  started:");
			Thread.sleep(100);
			fw= new FileWriter("C:\\Users\\Divya\\eclipse-workspace\\TBasket\\CoreJava\\src\\multithreading\\text",true);
			fw.write(this.getName()+"---\n call from"+getName() +"---current time is: "+(int) System.currentTimeMillis());
			fw.write(getName()+"count is :"+ count++);
			fw.write(System.getProperty("line.separator"));
			System.out.println(getName()+"count is :"+ count);
			Thread.sleep(1000);
			System.out.println(getName()+"  finished:");
			
		} catch (IOException | InterruptedException e) {
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

}
