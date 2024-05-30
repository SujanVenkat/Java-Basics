package problem.solving;
public class Pattern3{
	public static void main(String args[]) {
		int [][] array=new int[5][5];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				int r=i+1;
				int d=(array[i].length-r);
				if(j<array[i].length-d) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}