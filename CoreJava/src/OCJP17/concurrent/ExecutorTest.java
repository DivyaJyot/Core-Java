package OCJP17.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
	public static void main(String[] args) {
		int num = Runtime.getRuntime().availableProcessors();
		System.out.println(num);
		ExecutorService exservice= Executors.newFixedThreadPool(num);
		exservice.execute(() -> printNumber());
		exservice.shutdown();
	}
public static void printNumber(){
	for(int i=0; i<1000;i++) {
		System.out.println(i);
	}
}
	
}