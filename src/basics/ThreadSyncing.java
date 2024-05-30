package basics;
class ThreadSyncing{
	static int count;
	public static void main(String args[]) throws Exception {
	Demo s=new Demo();
		class Part1 implements Runnable{
			public void run() {
				for(int i=0;i<10000;i+=50) {
					s.increment();
					
				}
			}
		}
		class Part2 implements Runnable{
			public void run() {
				for(int i=0;i<10000;i+=50) {
					s.increment();
				}
			}
		}
		Part1 r=new Part1();
		Thread t1=new Thread(r);
		t1.start();
		Part2 e=new Part2();
		Thread t2=new Thread(e);
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(s.count);
		
	}
}
class Demo{
	int count=0;
	public  synchronized void increment() {
		count+=50;
	}
}
