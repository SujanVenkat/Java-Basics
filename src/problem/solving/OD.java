//checking whether given array is in ascending or not
package problem.solving;
public class OD {
	public static void main(String args[]) {
	   int[] array= {1,2,4,7};
	   int t=0;
	   int g=0;
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
