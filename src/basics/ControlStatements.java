package basics;
public class ControlStatements{
	public static void main(String args[]) {
		int a=6;
		int b=3;
		// if
		if(a>b) {
			System.out.println("a is greater than b");
		}
		
		// if else
		if(a>b) {
			System.out.println("a>b");
			
		}
		else {
			System.out.println("a<b");
		}
		
		//---if else if else
		if(a<b) {
			System.out.println("hi");
		}
			else if(a==0) {
				System.out.println("hello");
			}
			else {
				System.out.println("nothing");
			}
		
		//----------nested if
		if(a>b) {
			if(a!=0) {
				System.out.println("happy");
			}
		}
		}
	}
