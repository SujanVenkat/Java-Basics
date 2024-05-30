package basics;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {
	
	public static void main(String args[]) {
		Set<Integer> l= new TreeSet();
		l.add(5);
		l.add(3);
		l.add(1);
		
		
		
//		Iterator<Integer> itr=l.iterator();
		for(Integer a:l) {
			System.out.println(a);
		}
//		Iterator<Integer> itr=l.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
	}

}
