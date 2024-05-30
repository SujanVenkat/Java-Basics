package problem.solving;
public class Problem10{
	public static void main(String args[]) {
		int k=0;
		int [][] data;
		data=new int[5][5];
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				int d=data[i].length-i;
				if(j<=data[i].length-d) {
					if(i==2 && j!=1) {
						k=0;
					}
					if(k==0) {
						k++;
						System.out.print(k);
					}
					else {
						k--;
						System.out.print(k);
					}
				}
			}
			System.out.println();
		}
	}
}