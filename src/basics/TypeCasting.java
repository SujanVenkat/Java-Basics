package basics;
public class TypeCasting{
	public static void main(String args[]) {
		int a=10;
		double j;
		j=a;
		System.out.println(j);
	    //----------------------------
		double d=10.0f;
		int z;
		z=(int)d;
		System.out.println(z);
		//-----------------Ascii values
		char b='x';
		byte v;
		v=(byte)b;
		System.out.println(v);
		//-------------------
		byte l=120;
		char t;
		t=(char)l;
		System.out.println(t);
		//-----------boolean can't be changed to any other data type 
//		boolean h=false;
//		byte r;
//		r=(byte)h;
//		System.out.println(r);
		//
	}
}