package basics;
import java.util.*;
public class TreeMapDemo{
	public static void main(String args[]) {
		TreeMap<Integer,String> tm=new TreeMap<>();
		TreeMap<Integer,String> tm1=new TreeMap<>(Map.of(78,"su",2,"r"));
		tm.put(10,"A");//imp
		tm.put(2,"B");
		tm.put(3, null);
		tm.put(4, "d");
		System.out.println(tm);
		System.out.println(tm1);
		System.out.println(tm.ceilingEntry(9));
		System.out.println(tm.ceilingKey(9));
		System.out.println(tm.floorEntry(6));
		System.out.println(tm.floorKey(5));
		System.out.println(tm.containsValue("d"));
		System.out.println(tm.containsKey(11));
		System.out.println(tm.get(2));//imp
		System.out.println(tm.replace(2, "change"));
		System.out.println(tm);
        System.out.println(tm.firstEntry());
        System.out.println(tm.firstKey());
        System.out.println(tm);
       System.out.println(tm.pollFirstEntry());
       System.out.println("after removing"+tm);
       System.out.println(tm.pollLastEntry());
       System.out.println(tm);
	}
}
