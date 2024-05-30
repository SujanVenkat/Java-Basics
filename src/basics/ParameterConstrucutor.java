package basics;
public class ParameterConstrucutor{
	int a;
	int b;
	ParameterConstrucutor(){
		this(10,20);
		System.out.println("hi");
	}
	ParameterConstrucutor(int a,int b ){
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	public static void main(String args[]) {
		ParameterConstrucutor obj=new ParameterConstrucutor();
	}
	
}