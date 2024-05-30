package basics;
import java.util.*;
public class ArraylistDemo1{
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>(List.of(1,2,3,4,5));
		ArrayList<Integer> b=new ArrayList<>();
		b.add(6);
		b.add(7);
		b.add(8);
		b.add(1,10);
		System.out.println(b);
		b.addAll(a);
		System.out.println(b);
		b.addAll(0,a);
		System.out.println(b);
		b.remove(10);
		System.out.println(b);
		b.removeAll(a);
		System.out.println(b);
		b.retainAll(a);//no common elements so empty
		System.out.println(b);
		b.clear();
		System.out.println(b);
		System.out.println(b.isEmpty());
		System.out.println(a.size());
		a.iterator();
		b.addAll(a);
		System.out.println(b);
		System.out.println(b.equals(a));
		System.out.println(a);
		System.out.println(b);
		System.out.println(b.contains(10));
		System.out.println(b.containsAll(a));
		System.out.println(b.size());
		System.out.println(b.indexOf(5));
		System.out.println(b.get(1));
		b.set(0,0);
		System.out.println(b);
		b.add(2);
		System.out.println(b);
		System.out.println(b.lastIndexOf(2));
		b.listIterator();
		b.listIterator(3);
		System.out.println(b.subList(1,4));
		System.out.println(b);
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i));
		}
		//--------------------------------
		System.out.println("new iterator");
		for(Iterator<Integer> it=b.listIterator();it.hasNext();) {
			System.out.println(it.next());
		}
	}
}