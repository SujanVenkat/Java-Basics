package problem.solving;
public class Pattern7{
	public static void main(String args[]) {
		int[][] data;
		data=new int[5][5];
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				int d=data[i].length-i;
				if(j<d) {
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