package basics;
public class Static{
	int a;
	static int b;
	public static void main(String args[]) {
		Static s1=new Static();
		Static s2=new Static();
		System.out.println(s1.a);
		System.out.println(s1.b);//wrong way to call 
		//correct way is classname.staticvariable-->Static.b
		b=40;
		System.out.println(Static.b);
		System.out.println(s1.b);//not best practice
		System.out.println(s2.b);//not best practice
		
	}
	
}