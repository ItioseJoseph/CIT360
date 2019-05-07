package edu.ItioseJoseph.test;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class MyExecutors {

	public static void main(String[] args) {
		System.out.println("Hello: " + Thread.currentThread().getName());
		
		System.out.println("Executor Service");
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		System.out.println("Runnable");
		Runnable runnable = () -> {
			System.out.println("Hello: " + Thread.currentThread().getName());
		};
		
		executor.submit(runnable);
		executor.shutdown();

	}

}
