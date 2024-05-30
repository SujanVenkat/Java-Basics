//Taking an array as an input and printing its elements.
package basics;
import java.util.*;
public class OneD{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int [] v= {a,b,c};
		for(int i=0;i<v.length;i++) {
		System.out.print(v[i]+ " ");
		}
	}
		
}