package basics;
class Pet{
	int a=30;
	int t=60;
	public void speak() {
		System.out.println("pet channel");
	}
}
class Dog1 extends Pet{
	public void speak() {
	//we have overridden parent method so we want to know what actually in parent speak()method can be invoke  by super.speak()
		System.out.println("bow!");
		super.speak();///<-----------------
	}
	
}
class Cat extends Pet{
	int a=30;
	int t=50;
	public void speak() {
		System.out.println("meow!");
	}
}
public class OverRiding{
	public static void main(String args[]) {
		Pet d1=new Cat();
		d1.speak();
		System.out.println(d1.a+""+d1.t);
	}
}