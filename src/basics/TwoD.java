package basics;
import java.util.*;
public class TwoD{
	public static void main(String args[]) {
		int [][] data= {{10,20,30},{40,50,60}};
		System.out.println(data[1][0]);
		Scanner sc=new Scanner (System.in);
		int d=sc.nextInt();
		int c=sc.nextInt();
		int [][] array=new int[d][c];
		for(int i=0;i<d;i++) {
			for(int j=0;j<c;j++) {
				array[i][j]=sc.nextInt();
			}
		}
			for(int i=0;i<d;i++) {
				for(int j=0;j<c;j++) {
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			
			
		}
	}
}