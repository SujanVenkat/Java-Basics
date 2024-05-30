package basics;
import java.util.*;
public class Strings{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String name="sujan";//String literals
		String name1="sujan";
		String name2="sujan";
		System.out.println(name);
//		String fullname=sc.next();
//		System.out.println(fullname);
//        String lastname=sc.nextLine();
//		System.out.println(lastname);
		name=name+" "+"venkat";
		System.out.println(name);
		System.out.println(name.length());
		name="dujan";
		System.out.println(name);
		System.out.println(name.charAt(2));
		System.out.println(name1.compareTo(name2));
		System.out.println(name.compareTo(name2));
		System.out.println(name1.substring(1,4));
		System.out.println(name1.substring(1));
		System.out.println(name1.substring(1,name1.length()));
		boolean b=name1.equals(name2);
		System.out.println(b);
		//string to number---------
		String s="12";
		int number=Integer.parseInt(s);
		System.out.println(number);
		//---number to string
	    int no=123;
	    String str1=Integer.toString(no);
	    String nam="sujan";
	    String nam1="SUJAN";
	    System.out.println("this method ignores case "+nam.equalsIgnoreCase(nam1));
	    System.out.println(nam.toUpperCase());
	    System.out.println(nam1.toLowerCase());
	    System.out.println(nam.startsWith("su"));
	    System.out.println(nam.endsWith("n"));
	    String ww="";
	    System.out.println(ww.isEmpty());
	    String w="a b c";
	    String[] g=w.split(" ");
	    for(int i=0;i<g.length;i++) {
	    	System.out.println(g[i]);
	    }
	    String h="sujan venkat";
	    System.out.println("search"+h.indexOf("p"));
	    String dd=" sujan ";
	    System.out.println(dd.trim());
	    String planet="Moon";
	    System.out.println(planet.replace('o', 's'));
	    String r="sujan";
	    System.out.println(r.repeat(3));
	    String hh="   ";
	    System.out.println(hh.isBlank());
	    String test=" sujan ";
	    System.out.println(test.strip());
	    System.out.println(test.stripLeading());
	    System.out.println(test.stripTrailing());
	    String word1 = "Willow", word2 = "ow";
	    System.out.println("Will"+word2=="willow");
	}
}