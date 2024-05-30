package basics;
import java.util.*;
public class linkedhashsetDemo {
	public static void main(String args[]) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>(10,0.5f);
		lhs.add(1);
        lhs.add(3);
        lhs.add(2);
        lhs.add(6);
        lhs.add(6);
        System.out.println(lhs);
	}

}
