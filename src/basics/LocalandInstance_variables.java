package basics;
public class LocalandInstance_variables{
	int i;// instance variable it takes the default values
	LocalandInstance_variables(){ //special method this method is called when object is created
		System.out.println("default constructor");
	}
	public static void main(String args[]) {
		int j=0;//local variables are variables that can acccesed within the method itself and local variable must be intialized before it is used 
		//now this j reference variable in main method
		LocalandInstance_variables e=new LocalandInstance_variables();
		System.out.println(e.i);//instance variable can only accessed by creating a object only
		System.out.println(j);
	}
	
}