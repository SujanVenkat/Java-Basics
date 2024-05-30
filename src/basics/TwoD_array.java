package basics;
import java.util.*;
public class TwoD_array {

	public static void main(String[] args) {
		//-------------
		int[][] array= {{1,2,3},{4,5,6}};
		System.out.println(array[1][0]);
		System.out.println(array.length);
		//------------------
		int [][] array1;
		array1=new int[2][2];
		array1[0][0]=5;
		array1[0][1]=4;
		array1[1][0]=3;
		array1[1][1]=2;
		System.out.println(array1[1][1]);
		//===========
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int r=sc.nextInt();
		int [][] array2;
		array2=new int[d][r];
		System.out.println(array2.length);
		System.out.println(array2[2].length);//this gives no of coloums in given row "arrayname[which row].length"
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				array2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
		
		


		

	}

}
