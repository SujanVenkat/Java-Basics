package basics;
public class Break_Continue{
	public static void main(String args[]) {
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				continue;
			}
			if(i>6) {
				break;
			}
			System.out.println("hi");
		}
		System.out.println("out of looop");
		
		//---------nested loop
		for(int j=0;j<4;j++) {
			while(j==3) {
				System.out.println("3 num is found");
				break;
			}
		}
		System.out.println("out of for while loop");
	}
}
