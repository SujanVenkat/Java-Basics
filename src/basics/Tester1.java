package basics;
public class Tester1{
	public static void main(String args[]) {
		Chocolate c1=new Chocolate(1001,"cadbury",12,10);
		System.out.println(c1.barCode);
		c1.setbarCode(101);
		System.out.println(c1.getcode());
	}
}