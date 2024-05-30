package basics;
import java.util.*;
public class StackDemo{
	public static void main(String args[]) {
		Stack<Integer> s1=new Stack<>();
		s1.push(1);
		s1.push(2);
		s1.push(3);
	    System.out.println(s1);
	    s1.pop();
	    System.out.println(s1);
	    System.out.println(s1.peek());
	    System.out.println(s1);
	    s1.push(10);
	    s1.push(20);
	    s1.push(30);
	    s1.push(null);
	    System.out.println(s1);
	    System.out.println(s1.search(30));
	    System.out.println(s1.indexOf(30));
	    System.out.println(s1.search(100));
	    System.out.println("reverse printing");
	    System.out.println(s1.pop());
	    System.out.println(s1.pop());
	    System.out.println(s1.pop());
	    System.out.println(s1.pop());
	    System.out.println(s1.pop());
	    System.out.println(s1.pop());
	}
}