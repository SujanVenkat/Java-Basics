package problem.solving;
import java.util.*;
public class Solution{
	public static int f;
	public static String s="";
	public static String str="";
	public  String backSpaceStringCompare(String s) {
		int f=s.indexOf("#");
		while(f>0) {
			for(int i=0;i<s.length();i++) {
				if(i==f||i==f-1) {
					continue;
				}
				else {
					str=str+Character.toString(s.charAt(i));
				}
			}
			s=str;
			str="";
			f=s.indexOf("#");	
		}
		return s;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Solution s1=new Solution();
		Solution s2=new Solution();
		boolean b=(s1.backSpaceStringCompare(sc.nextLine()).equals(s2.backSpaceStringCompare(sc.nextLine())));
		System.out.println(b);
	}
}