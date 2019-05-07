package edu.ItioseJoseph.test;
import java.util.*;
public class MyCollectionJavaTest2 {

	public static void main(String[] args) {
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("Vera");
		hashset.add("Rosemary");
		hashset.add("Vera");
		hashset.add("Rachel");
		
		Iterator<String> itr=hashset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
