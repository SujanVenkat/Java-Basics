package basics;
public class ThrowsClass {
	public static void divide(int a,int b) throws ArithmeticException, Exception {
		int x=a/b;
		System.out.println(x);
	}
public static void main(String args[]){
	try{
		divide(10,0);
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
		System.out.println("ari error");
	}
	catch(Exception ex) {
		System.out.println("here handled");
	}
}
}
