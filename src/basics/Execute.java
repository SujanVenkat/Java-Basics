package basics;
class Parent{
	int a=100;
		 void says() {
		System.out.println("parent");
	}
		void hello() {
			 System.out.println("hello");
		 }
}
class child1 extends Parent{
	int b=50;
	 void says() {
		System.out.println("child1");
	}
	 void welcome() {
		 System.out.println("welcome");
	 }
}
class child2 extends Parent{
	int c=25;
	void says() {
		System.out.println("child2");
		super.hello();
	}
}
//child1=a b says()[child],welcome()
//parent=a says()[child],hello()
public class Execute{
	public static void main(String args[]) {
		child1 child1=new child1();
		 System.out.println(child1.b);
	    Parent parent=new child1();
	    System.out.println(parent.a);
        //System.out.println(parent.b);
	}
}