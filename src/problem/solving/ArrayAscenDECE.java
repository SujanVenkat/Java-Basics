//Take an array of numbers as input and check if it is an array sorted in ascending order.
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//       {3, 4, 6, 2} is not sorted in ascending order.
package problem.solving;
import java.util.*;
public class ArrayAscenDECE{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=0;
		int g=0;
		int d=sc.nextInt();
		int [] array=new int[d];
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		for(int i=0;i<array.length;i++) {
				int h=array[i];
				if(i+1<array.length) {
				t=array[i+1];
				}
				else {
					t=h+1;
				}
				if(h<t) {
					g++;
					continue;
			}
				else {
					
					System.out.println("array is not in ascending order");
					break;
				}
			}
			if(g==array.length) {
			System.out.println("array is in ascending order");
			}
				
	}
}