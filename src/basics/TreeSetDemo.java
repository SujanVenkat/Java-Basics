package basics;
import java.util.*;
public class TreeSetDemo{
	public static void main(String args[]) {
		TreeSet<Integer> ts=new TreeSet<>(List.of(3,5,1,3,6));
		TreeSet<Integer> ts1=new TreeSet<>(List.of(10,20,30,41,50));
		ts1.add(15);
		ts1.add(25);
		ts1.add(35);
		ts1.add(45);
		System.out.println(ts);
		System.out.println(ts1);
		System.out.println(ts1.ceiling(40));
		System.out.println(ts1.floor(21));
		System.out.println(ts1.first());
		System.out.println(ts1.pollFirst());
		System.out.println(ts1.pollLast());
		System.out.println(ts1.subSet(20,50));
		ts1.toString();
		TreeSet<Integer> ts3=new TreeSet<>(Comparator.reverseOrder());
		ts3.add(90);
		ts3.add(43);
		System.out.println(ts3);
		for(Iterator<Integer> it=ts3.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
	}
}