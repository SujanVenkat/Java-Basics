package problem.solving;
import java.util.*;
public class Pattern2 {
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		int r=num.nextInt();
		int c=num.nextInt();
		int [][] matrix=new int[r][c];
		for(int i=0;i<matrix.length;i++) {	
			for(int j=0;j<matrix[i].length;j++) {
				if(i>0 && i<matrix.length-1) {
					if(j>0 && j<matrix[i].length-1) {
						System.out.print("  ");
						continue;
					}
				}
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
