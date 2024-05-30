package basics;
import java.util.*;
public class HashMapDemo {
	public static void main(String args[]) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(4, "sujan");
		hm.put(null,null);
		System.out.println(hm.get(4));
		hm.remove(4);
		System.out.println(hm);
		
		
		//every same methods of like treeMap and working is as like tree set extra with key,value 
		
	}

}
