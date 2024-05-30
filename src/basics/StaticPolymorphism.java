package basics;
public class StaticPolymorphism{
	public void sujanmethod() {
		System.out.println("hi");
	}
//	public void sujanmethod() { duplicate not allowed
//		System.out.println("hi");
//	}
	
	public void sujanmethod(int a,int b,int c) {
		System.out.println("static polymorphism=method overloading");
	}
	public void sujanmethod(double a,int b) {
		System.out.println("h1");
	}
	public void sujanmethod(int b,double a) {
		System.out.println("h2");
	}
	public static void main(String args[]) {
		StaticPolymorphism obj=new StaticPolymorphism();
		obj.sujanmethod();
		obj.sujanmethod(3,1,4);
//		obj.sujanmethod(2,5);//compiler get confuse that which should upcast either  2 or 5 so ambigous occur
		obj.sujanmethod((double)2,5);
	}
}