package basics;
public class ExceptionPropogation{
	static void divide(int a,int b) {
		int x=a/b;
		System.out.println(x);
	}
	public static void main(String args[]) {
	divide(10,0);	
	}
}