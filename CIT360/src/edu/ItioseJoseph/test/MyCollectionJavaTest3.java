package edu.ItioseJoseph.test;
import java.util.*;
public class MyCollectionJavaTest3 {

	public static void main(String[] args) {
		TreeSet<String> Tset=new TreeSet<String>();
		Tset.add("Bela");
		Tset.add("Abdulla");
		Tset.add("Osama");
		Tset.add("Gamala");
		Tset.add("Hamala");
		
		Iterator<String> itr=Tset.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
