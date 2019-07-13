package edu.ItioseJoseph.test;
import junit.framework.*;

public class MyJunitTestSuite {

	public static void main(String[] args) {
		TestSuite suite = new TestSuite(MyJunitTest.class, MyJunitTest1.class, MyJunitTest2.class);
		TestResult outcome = new TestResult();
		suite.run(outcome);
		System.out.println("Number of test cases =" + outcome.runCount());
		

	}

}
