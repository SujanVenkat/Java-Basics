package problem.solving;
public class Pattern6{
	public static void main(String args[]) {
		int [][] matrix;
		matrix=new int [5][5];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(j<=i) {
					System.out.print(j+1+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}