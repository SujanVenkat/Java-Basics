//153 = 13+53+33 = 153 is an Armstrong number.
package problem.solving;
public class FunCalculator {
public static void main(String args[]) {
	int b=0;
	int n=371;
	int f=n;
	while(n>0) {
	int a=n%10;
	int s=a*a*a;
	b=b+s;
	n/=10;
	}
	System.out.println(b==f);
}
}
