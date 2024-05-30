package basics;
import java.util.*;
public class ArrayDequeDemo{
	public static void main(String args[]) {
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.offerLast(10);
		ad.offerLast(20);
		ad.offerLast(30);
		System.out.println(ad);
		ad.offerFirst(2);
		ad.offerFirst(5);
		System.out.println(ad);
		ad.pollFirst();
		System.out.println(ad);
		ad.pollLast();
		System.out.println(ad);
		ad.poll();
		System.out.println("sujan"+ad);
		//ad.offer(null);null values prohibited
		// arraydeque here behaves has stack
		ArrayDeque<Integer> al=new ArrayDeque<>();
		al.offerLast(3);
		al.offerLast(7);
		al.pollLast();
		System.out.println(al);
		//arraydeque here behaves as queue
		ArrayDeque<Integer> adq=new ArrayDeque<>();
		adq.offerLast(50);
		adq.offerLast(10);
		System.out.println("sujan"+adq);
		adq.poll();
		System.out.println(adq);
	
	}
}