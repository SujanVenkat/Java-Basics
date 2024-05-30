package problem.solving;
import java.util.*;
public class Pattern4{
	public static void main(String args[]) {
		int [][] matrix;
		matrix=new int[5][5];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
					if(j<matrix[i].length-i) {
						System.out.print("*"+" ");
					}
					else {
						System.out.print(" "+" ");
					}
				}
				System.out.println();
			}
			}
		}
	
