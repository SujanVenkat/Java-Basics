package problem.solving;
public class Pattern12{
	public static void main(String args[]) {
		int k=0;
		int [][] triangle;
		triangle=new int[9][9];
		for(int i=0;i<triangle.length;i++) {
			for(int j=0;j<triangle[i].length;j++) {
				if(triangle[i].length%2==1) {
					int d=triangle[i].length-1;
					int e=triangle.length-1;
					int p=e/2;
					int s=d/2;
					int f=s-i;
					int g=s+i;
					if(i<=p&&j>=f&&j<=g) {
						System.out.print("*"+" ");
					}
					else if(i>p) {
						int w=triangle[i].length-1;
						int u=w/2;
						int y=i-u;
						if(j>=y&&j<=w-y) {
						System.out.print("*"+" ");
						}
					else {
						System.out.print(" "+" ");
					}
					}
					else {
					System.out.print(" "+" ");
				}
				}
	}
			System.out.println();
		}
}
}