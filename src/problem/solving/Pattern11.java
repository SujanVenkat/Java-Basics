package problem.solving;
public class Pattern11{
	public static void main(String args[]) {
		int [][] triangle;
		triangle=new int[5][9];
		for(int i=0;i<triangle.length;i++) {
			for(int j=0;j<triangle[i].length;j++) {
				if(triangle[i].length%2==1) {
					int d=triangle[i].length-1;
					int s=d/2;
					int f=s-i;
					int g=s+i;
					if(j>=f&&j<=g) {
						System.out.print("*"+" ");
					}
					else {
					System.out.print(" "+" ");
				}
				}
				else {
					System.out.print("not possible");
				}
			}
			System.out.println();
		}
	}
}