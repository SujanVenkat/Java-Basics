//72 to 27
package problem.solving;
import java.util.*;
public class ReverseCalculator{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int num=sc.nextInt();
		while(num>0) {
		int b=num%10;
		a=a*10+b;
		num/=10;
	}
		System.out.println(a);
}
}