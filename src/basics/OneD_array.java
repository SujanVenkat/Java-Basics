package basics;
import java.util.*;
public class OneD_array {
public static void main(String args[]) {
	//--------------
	int[] array= {1,2,3,4,5};
	System.out.println(array[3]);
	System.out.println(array.length);
	//------------
	int [] array1;
	array1=new int[4];
	array1[0]=1;
	array1[1]=2;
	array1[2]=3;
	array1[3]=4;
	System.out.println(array1[2]);
	System.out.println(array1.length);
	//---------------
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int[] array2;
    array2=new int[num];
    System.out.println(array2.length);
    for(int i=0;i<array2.length;i++) {
    	array2[i]=sc.nextInt();
    }
    for(int j=0;j<array2.length;j++) {
    	System.out.print(array2[j]+ " ");
    }
    System.out.println();
   
}
}
