package basics;
public class MultiThreadInterface{
	public static void main(String args[])throws Exception {
	Work1 f=new Work1();
	Thread t1=new Thread(f,"sujan");
	System.out.println(t1.getState());
	sujan g=new sujan();
	Thread t2=new Thread(g);
	t1.start();
	//t1.join();
	//t1.sleep(10000);
	t2.start();
	t1.yield();
	System.out.println(t1.getState());
	t1.start();
	}
}
class Work1 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		for(int i=0;i<=10;i++) {
			System.out.println("work");
			}
	}
	
}
class sujan implements Runnable{
	public void run() {
		for(int i=0;i<=100;i++) {
		System.out.println("hi");
		}
	}
}