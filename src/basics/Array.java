package basics;
public class Array{
	public static void main(String args[]) {
		//------------------
		int [] array1= {1,2,3,4,5};
		System.out.println(array1[0]);
		System.out.println(array1[2]);
		//---------
		int [] array2=new int[4];
		array2[0]=23;
		array2[1]=34;
		array2[2]=56;
		array2[3]=90;
		System.out.println(array2[2]);
		System.out.println(array2.length);
		System.out.println(array1.length);
		for(int i:array1) {
			System.out.print(i+ " ");
		}
	}
}