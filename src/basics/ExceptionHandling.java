package basics;
public class ExceptionHandling{
	static void divide(int a,int b) {
		try {
		int x=a/b;
		System.out.println(x);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("arthematic error occured"+e+"this can  be used in code "+e.getMessage());
		}
		finally {
			System.out.println("finally");
		}
		try {
			int [] ar=new int[3];
			ar[0]=0;
			ar[1]=1;
			ar[2]=3;
			ar[3]=4;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ex){
			System.out.println("default exception handler"+ex+ex.getMessage());
			
		}
		finally {
			System.out.println("error finally");
		}
		try {
			String p=null;
			System.out.println(p.length());
		}
		catch(Exception ex){
			System.out.println("default exception handler"+ex+ex.getMessage());
			
		}
		finally {
			System.out.println("null error by sujan");
		}
	}
	public static void main(String args[]) {
	divide(10,0);	
	}
}