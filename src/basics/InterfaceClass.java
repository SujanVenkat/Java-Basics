package basics;

public class InterfaceClass implements Interfaceclass1,Interfaceclass2 {

	public void task() {
		System.out.println("override");
	}

	@Override
	public void noise() {
		// TODO Auto-generated method stub
		
	}
 public static void main(String args[]) {
	 InterfaceClass v=new InterfaceClass();
	 v.task();
 }
	

}
