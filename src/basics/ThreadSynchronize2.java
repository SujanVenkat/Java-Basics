package basics;
public class ThreadSynchronize2{
	public static void main(String args[]) throws Exception  {
		Todo1 e=new Todo1();
		Thread t1=new Thread(e);
		Work r=new Work(); 
		Thread t2=new Thread(r);
		t2.start();
		t2.join();
		t2.sleep(10000);
		//t2.yield();
		System.out.println(t2.getState());
		t1.start();
	}
}
class Todo1 implements Runnable{
	//override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("sujan");
			System.out.println(Thread.currentThread().getState());
		}
	}
	
}
class Work implements Runnable{
	//override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("venkat");
		}
	}
	
}