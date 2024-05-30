package basics;
public class ThrowThrowsClass{
	public static void divide(int a,int b) {
		try {
		if(b==0) {
			throw new ArithmeticException("error will  occur");
		}
		int x=a/b;
		System.out.println(x);
		}
		catch(ArithmeticException e) {
			System.out.println("handled");
		}
		System.out.println("sujan");
		
	}
	public static void main(String args[]) {
		divide(10,0);
	}
}