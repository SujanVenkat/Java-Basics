package basics;
import java.util.*;
public class Customer{
	String CustomerType;
	String CustomerName;
	public String getName() {
		String test="hi"+CustomerName;
		return test;
	}
	public String getDiscount() {
		if(CustomerType.equalsIgnoreCase("Regular")) {
			String test1="10% discount is applicable";
			return test1;
		}
		else {
			return "20% discount is applicable";
		}
	}
	public String findDiscountAndName(String s,String b) {
		this.CustomerType=s;
		this.CustomerName=b;
		return getName()+getDiscount();
		
	}
	public static void main(String args[]) {
		Customer c1=new Customer();
		Customer c2=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println(c1.findDiscountAndName(sc.nextLine(),sc.nextLine()));
		System.out.println(c2.findDiscountAndName(sc.nextLine(),sc.nextLine()));
		
		
	}
}