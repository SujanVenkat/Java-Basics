package problem.solving;
public class Pattern5{
	public static void main(String args[]) {
		int [][] array;
		array=new int[5][5];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				int y=2+i;
				if(j>array[i].length-y) {
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