package basics;
import java.util.*;
public class ArrayDequeDemo1{
	public static void main(String args[]) {
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		//ad.offer(null);
		ad.add(10);
		ad.addLast(20);
		ad.offer(30);
		ad.offerLast(40);
		System.out.println(ad);
		ad.pollLast();
		System.out.println(ad);
		ad.removeLast();
		System.out.println(ad);
		ad.addFirst(1);
		ad.offerFirst(2);
		System.out.println(ad);
		ad.removeFirst();
		System.out.println(ad);
		ad.pollFirst();
		System.out.println(ad);
		ad.remove();
		System.out.println(ad);
		ad.offerLast(30);
		ad.offerLast(100);
		ad.offerLast(90);
        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println(ad.clone());
        //making arraydeque behaves as stack
        System.out.println("making arraydeque behaves as stack");
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.offerLast(78);
        ad1.offerLast(45);
        ad1.offerLast(32);
        ad1.pollLast();
        System.out.println("ad1"+ad1);
        //making arraydeque behave as queue
        ArrayDeque<Integer> ad2=new ArrayDeque<>();
        System.out.println("making arraydeque behaves as queue");
        ad2.addLast(90);
        ad2.offerLast(80);
        System.out.println(ad2);
        ad2.pollFirst();
        System.out.println(ad2);
		
		
		
	}
}