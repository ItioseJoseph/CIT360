package edu.ItioseJoseph.test;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class MyJunitTest1 extends TestCase {
	protected int jValue1;
	protected int jValue2;
	
	@Before
	public void setUp() {
		jValue1 = 3;
		jValue2 = 4;
	}
	
	@Test
	public void Test() {
		
		System.out.println("No of Test Case = "+ this.countTestCases());
		
		String name = this.getName();
		
		System.out.println("Test Case Name = "+ name);
		
		this.setName("testCurrent");
		String currentName = this.getName();
		System.out.println("Updated Test case Name = "+ currentName);
		
			
	}
	
	public void tearDown() {
		
	}

}
