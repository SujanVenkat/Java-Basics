package basics;
public class StaticBlock{
	 static {
		 int i=8;
		 int amount=12;
		 System.out.println(i+amount+" hi iam static block 1 static block will run first before main method start ");
	 }
	StaticBlock(){
		System.out.println("hi i am consturctor");
	}
	static void methodS(){
		System.out.println("method");
	}
	 void methodf(){
		System.out.println("method");
	}
	 static {
		 System.out.println("hi iam static block 2 ");
	 }
	public static void main (String args[]) {
		StaticBlock s1=new StaticBlock();
		StaticBlock s2=new StaticBlock();
		methodS();
		s1.methodf();
	}
}