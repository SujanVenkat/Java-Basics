package basics;
import java.util.*;
public class ArraylistDemo{
	public static void main(String args[]) {
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>(List.of(5,6,7,8));
		al1.add(5);
		al1.add(0,4);
		al1.addAll(al2);
		al1.remove(5);
		al1.removeAll(al2);
		al1.size();
		System.out.println(al1.size());
		al1.addAll(al2);
		System.out.println(al1.isEmpty());
		System.out.println(al1.indexOf(7));
		System.out.println(al1.get(2));
		System.out.println(al1.retainAll(al2));
		System.out.println(al1.contains(6));
		al1.set(0,10);
		System.out.println(al1.containsAll(al2));
		System.out.println(al1);
		System.out.println(al1.equals(al2));
		System.out.println(al1.subList(1, 3));
		System.out.println(al1);
		for(int i=0;i<al1.size();i++) {
			System.out.println("sujan"+al1.get(i));
		}
		System.out.println("another for loop");
		for(ListIterator<Integer> it=al1.listIterator();it.hasNext();) {
			System.out.println(it.next());
		}
		al1.clear();
	}
	
}