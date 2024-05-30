package basics;
public class ThreadSynchronization{
	public static void main(String args[]) {
		Todo t1=new Todo("todothread by sujan naming thread");
		t1.start();
		System.out.println(t1.getName());
        Towork t2=new Towork("towork thread by sujan");
		t2.start();
		System.out.println(t2.getName());
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		System.out.println("hi"+Thread.currentThread().getId());
	}
}
class Todo extends Thread{
	Todo(String f){
		super(f);
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getPriority());
			System.out.println(Thread.currentThread().getId());
			System.out.println("sujan");
		}
	}
}
class Towork extends Thread{
	Towork(String d){
		super(d);
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getId());
			System.out.println("venkat");
		}
	}
}