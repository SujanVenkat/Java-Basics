//1623 = 62+32 = 45 is a multiple of 9 and hence is a Lucky number
package problem.solving;
import java.util.*;
public class FunCalculator2{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int r=num;
		int h=0;
		while(num>0) {
		String s=Integer.toString(num);
		int digits=s.length();
		if(digits%2==0) {
			int y=num%10;
			h=h+y*y;
			num=num/10;
		}
		else {
			num=num/10;
		}
	}
		if(h%9==0) {
			System.out.println("given:"+r+" output:"+h+"and is divsible by 9 so lucky no number");
		}
		else {
			System.out.println("output:"+h+"and not divisible by 9 so not lucky number");
		}
		}
	}