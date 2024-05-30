package basics;
public class MultiThreading{
	public static void main(String args[]) {
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		Thread t1=new Thread();
		t1.setName("thread-1");
		Thread t2=new Thread();
		Thread t3=new Thread();
		Thread t4=new Thread();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println(Thread.activeCount());
		Character s='a';
	}
}