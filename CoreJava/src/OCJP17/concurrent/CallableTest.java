package OCJP17.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
	static ExecutorService executorService = Executors.newSingleThreadExecutor();
	static ExecutorService executorService1 = Executors.newFixedThreadPool(4);
	static List<Callable<String>> callables = new ArrayList<>();

	public static void main(String[] args) {

		callables.add(() -> "A");
		callables.add(() -> "B");
		callables.add(() -> "C");
		callables.add(() -> "D");
		invokeAll();
		executorService.shutdown();

	}

	public static void invokeAny() {
		try {
			String result = executorService.invokeAny(callables);
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	public static void invokeAll() {
		try {
			List<Future<String>> result= executorService.invokeAll(callables);
			for(Future<String> f :result) {
				System.out.println(f.get());
			}
		
		/*result.forEach(v ->
							System.out.println(v.get());
	);*/
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();}
		}
	}

