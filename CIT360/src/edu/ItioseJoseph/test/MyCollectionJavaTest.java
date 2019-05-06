package edu.ItioseJoseph.test;
import java.util.*;
public class MyCollectionJavaTest {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Vera");
		alist.add("Mercy");
		alist.add("Felix");
		alist.add("Japhet");
		alist.add("Charles");
		alist.add("Phillip");
		
		Iterator itr=alist.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		
		}


	}

}
