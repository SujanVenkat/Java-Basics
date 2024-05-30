package basics;
import java.util.*;
public class Problem1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int billid=sc.nextInt();
		int customerid=sc.nextInt();
		int discount=sc.nextInt();
		double billAmount=sc.nextDouble();
		double discountBillAmount =billAmount*((double)discount/100);
		System.out.println(billAmount-discountBillAmount);
	}
}