package edu.ItioseJoseph.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestRunner {

	public static void main(String[] args) {
		Result outcome = JUnitCore.runClasses(MyJunitTest.class);
		
		for(Failure failure : outcome.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(outcome.wasSuccessful());

	}

}
