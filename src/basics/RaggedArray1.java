package basics;
import java.util.*;
public class RaggedArray1{
	public static void main(String args[]) {
		Scanner n=new Scanner(System.in);
		int [][] array=new int [3][];
		array[0]=new int[3];
		array[1]=new int[2];
		array[2]=new int[1];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=n.nextInt();
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}