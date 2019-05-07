package edu.ItioseJoseph.test;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class MyExecutors1 {

	public static void main(String[] args) {
		System.out.println("Hello: " + Thread.currentThread().getName());
		
		System.out.println("Executor Service");
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		System.out.println("Runnable");
		
		Runnable runnable1 = () -> {
			System.out.println("Executing runnable1 Hello: " + Thread.currentThread().getName());
			
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException ex) {
				throw new IllegalStateException(ex);
			}
		};
		
		Runnable runnable2 = () -> {
			System.out.println("Executing runnable2 Hello: " + Thread.currentThread().getName());
			
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException ex) {
				throw new IllegalStateException(ex);
			}
		};
		
		Runnable runnable3 = () -> {
			System.out.println("Executing runnable3 Hello: " + Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException ex) {
				throw new IllegalStateException(ex);
			}
		};
		
		Runnable runnable4 = () -> {
			System.out.println("Executing runnable4 Hello: " + Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException ex) {
				throw new IllegalStateException(ex);
			}
		};
		
		executor.submit(runnable1);
		executor.submit(runnable2);
		executor.submit(runnable3);
		executor.submit(runnable4);
		
		executor.shutdown();

	}

}
