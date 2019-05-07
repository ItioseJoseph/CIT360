package edu.ItioseJoseph.test;
import java.util.*;
public class MyCollectionJavaTest1 {

	public static void main(String[] args) {
		LinkedList<String> jl=new LinkedList<String>();
		jl.add("Vera");
		jl.add("Mercy");
		jl.add("Felix");
		jl.add("Terry");
		jl.add("Amax");
		
		Iterator <String> itr=jl.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
