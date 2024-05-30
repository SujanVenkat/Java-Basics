package basics;
import java.util.*;
public class LinkedlistDemo{
	public static void main(String args[]) {
		LinkedList<Integer> l1=new LinkedList<>(List.of(10,20,30,40,50,60));
		LinkedList<Integer> l2=new LinkedList<>();
		l2.add(70);
		l2.add(80);
		l2.add(90);
		l2.add(0,100);
		System.out.println(l2);
		l2.addAll(l1);
		System.out.println(l2);
		System.out.println(l2.subList(5,l2.size()));
		l2.addFirst(400);
		l2.addLast(10000);
		System.out.println(l2);
		l2.removeFirst();
		l2.removeLast();
		System.out.println(l2); 
		System.out.println(l2.getFirst());
		System.out.println(l2.getLast());
		System.out.println(l2);
		System.out.println(l2.peek());
		System.out.println(l2.element());
		System.out.println(l2.poll());
		System.out.println(l2);
		System.out.println(l2.remove());
		System.out.println(l2);
		System.out.println(l2.peekFirst());
		System.out.println(l2.peekLast());
		System.out.println(l2.pollFirst());
		System.out.println(l2);
		System.out.println(l2.pollLast());
		System.out.println(l2);
		System.out.println(l2.clone());
		l2.add(2,49);
		System.out.println(l2);
		System.out.println(l2.get(2));
	}
}