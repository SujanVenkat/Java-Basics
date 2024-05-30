package basics;
public class IncrementDecrement{
	public static void main(String args[]) {
		int i=1;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		int g=1;
		int j=g++;
		System.out.println(g+" "+j);//imp
		int z=2;
		int d=++z;
		System.out.println(z+" "+d);//imp
		int h=3;
		int l=h++ +4;
        System.out.println(h+" "+l);
        //same rules for decrement operator
        int k=6;
        k+=7;
        System.out.println(i);
	}
}