package basics;
import java.util.*;
public class JavaOperators{
	public static void main (String args[]) {
	int a=3;
    int b=4;
    int c=a+b;
    System.out.println(c);
    int d=a-b;
    System.out.println(d);
    int e=a*b;
    System.out.println(e);
    int f=a/b;
    System.out.println(f);
    int g=a%b;
    System.out.println(g);
    int i=4;
    i++;
    i+=5;
    System.out.println(i);
    i--;
    System.out.println(i);
     i+=5;
    System.out.println(i);
    i-=5;
    System.out.println(i);
    i*=5;
    System.out.println(i);
    i/=5;
    System.out.println(i);
    i%=5;
    System.out.println(i);
  //bitwise operations ~  & | ^ >> >>> << &= |= ^= >>= >>>= <<= 
    int df=8;
    int fg=1;
    System.out.println(df>>fg);
    //
    System.out.println(a==b);
    System.out.println(a!=b);
    System.out.println(a>b);
    System.out.println(a<b);
    System.out.println(a>=b);
    System.out.println(a<=b);
    System.out.println(5<2 && 3<=4);
    System.out.println(a>b || b<a);  
    System.out.print(!(a> b));
}
}
