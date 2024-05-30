package basics;
public class Static_Variable{
	static int i;
	public static void main (String args[]) {
		Static_Variable f1=new Static_Variable();
		Static_Variable f2=new Static_Variable();
		System.out.println(f1.i);
		System.out.println(f2.i);  
		f1.i=90;
		System.out.println(f1.i);
		System.out.println(f2.i);
		f2.i=30;
		System.out.println(f1.i);
		System.out.println(f2.i);
	}
	
}