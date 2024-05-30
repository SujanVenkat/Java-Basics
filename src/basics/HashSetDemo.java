package basics;
import java.util.*;
public class HashSetDemo{
	public static void main(String args[]) {
		HashSet<Integer> hs=new HashSet<>(List.of(1,2,3,4));
	    HashSet<Integer> hs1=new HashSet<>(20,0.5f);//intial value,loadfactor
	    HashSet<Integer> hs3=new HashSet<>(30);//intial capacity
	    hs1.add(10);
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(null);
		for(Iterator<Integer> it=hs1.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		hs1.addAll(hs);
		System.out.println(hs1);
		hs1.remove(1);
		System.out.println(hs1);
		hs1.removeAll(hs);
		System.out.println(hs1);
		HashSet<Integer> hs2=new HashSet<>(List.of(65,43,20));
		hs1.retainAll(hs2);
		System.out.println(hs1);
		System.out.println(hs1.contains(20));
		System.out.println(hs2.size());
		hs1.clear();
		System.out.println(hs1.isEmpty());
		System.out.println(hs.hashCode());
		hs.toString();
	}
}