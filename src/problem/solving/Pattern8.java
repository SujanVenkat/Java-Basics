package problem.solving;
public class Pattern8{
	public static void main(String args[]) {
		int k=1;
		int [][] matrix;
		matrix=new int [6][6];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(i==matrix.length-1 && j==matrix[i].length-1) {
				     continue;//skips particular step and runs
				}
				if(j<=i) {
					System.out.print(k+"  ");
					k++;
				}
				else {
					System.out.print("  "+"  ");
				}
			}
			System.out.println();
		}
	}
}