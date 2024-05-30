package basics;
import java.util.*;
public class VectorDemo{
	public static void main(String args[]) {
		Vector<Integer> v=new Vector<>();
		System.out.println(v.capacity());
		v.add(null);
		v.add(9);
		v.add(9);
		v.add(9);
		v.add(9);
		v.add(9);
		v.add(9);
		v.add(9);
		v.add(9);
		v.add(9);
		v.add(5);
		System.out.println(v.capacity());
	    System.out.println(v);
	}
}