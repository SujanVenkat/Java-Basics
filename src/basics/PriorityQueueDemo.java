package basics;
import java.util.*;
public class PriorityQueueDemo{
	public static void main(String args[]) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(20);
		pq.add(10);
		pq.add(30);
		pq.add(5);
		pq.add(15);
		pq.add(3);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println("remove "+pq.remove());
        System.out.println(pq);
        System.out.println("head element"+pq.peek());
        System.out.println("head element"+pq.element());
		
		PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
		pq1.add(20);
		pq1.add(10);
		pq1.add(30);
		pq1.add(5);
		pq1.add(15);
		pq1.offer(3);
		//null prohibited--pq.add(null);
		System.out.println("pq1"+pq1);
	}
}