package problem.solving;
import java.util.*;
import basics.*;
public class Pattern1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int f=sc.nextInt();
		int [][] array=new int[d][f];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		AccessModifiers_set_getvalues w3=new AccessModifiers_set_getvalues(23,"trail");
		System.out.println(w3.courseid);
		System.out.println(w3.getfee());
		
	}
}