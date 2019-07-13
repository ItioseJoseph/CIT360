package edu.ItioseJoseph.test;

import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class MyJunitTest2 extends TestResult {
	
	public synchronized void addError(Test test, Throwable t) {
		super.addError((junit.framework.Test) test, t);
		
	}
	
	public synchronized void addFailure(Test test, AssertionFailedError t) {
		super.addFailure((junit.framework.Test) test, t);
	}
	
	@Test
	public void test() {
		
	}
	
	public synchronized void stop() {
		
	}

}
