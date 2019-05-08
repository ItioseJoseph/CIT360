package edu.ItioseJoseph.test;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class MyExecutors2 {

	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		Runnable runnable = () -> {
			System.out.println("Executing Runnable" + System.nanoTime());
		};
		
		executor.scheduleWithFixedDelay(runnable, 0, 3, TimeUnit.SECONDS);

	}

}
