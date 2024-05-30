package basics;
public class MultiThreadingJava {
	public static void main(String args[]) {
		Work11 t1=new Work11("First thread");
		System.out.println(t1.getName());
		t1.start();
		Work2 t2=new Work2("secondThread");
		System.out.println(t2.getName()+"    "+t2.getPriority());
		t2.start();
		System.out.println("current active count"+Thread.activeCount());
		
	}
	
}