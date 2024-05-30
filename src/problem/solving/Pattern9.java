package problem.solving;
public class Pattern9{
	public static void main(String args[]) {
		int k=1;
		int [][] array;
		array=new int[5][];
		array[0]=new int[1];
		array[1]=new int[2];
		array[2]=new int[3];
		array[3]=new int[4];
		array[4]=new int[4];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}