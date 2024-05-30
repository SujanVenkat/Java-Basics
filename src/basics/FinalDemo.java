package basics;
public final class FinalDemo{
	double area;
	int radius;
	final double PI=3.14;
	final int value;//final value can only declare in constructor or should intialize while declaring
	FinalDemo(int v,int radii){
		this.value=v;
		this.radius=radii;
	}
	void calculatearea() {
		area=PI*radius*radius*value;
		System.out.println(area);
	}
	final void method() {
		System.out.println("hi i am final method");
	}
	public static void main(String args[]) {
		FinalDemo f1=new FinalDemo(1,7);
		f1.calculatearea();
		FinalDemo f2=new FinalDemo(1,8);
		f2.calculatearea();
		
	}
	
	
}