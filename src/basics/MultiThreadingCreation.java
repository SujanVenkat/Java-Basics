package basics;
class Work11 extends Thread{
	Work11(String s){
		super(s);
	}
	@Override
	public void run() {
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println("work1 addition"+c);
	}
}
//----------------------------------------------------//
	class Work2 extends Thread{
		Work2(String s){
			super(s);
		}
		@Override
		public void run() {
			int a=5;
			int b=6;
			int c=a*b;
			System.out.println("work2+multiplication"+c);
		}	
	
	
}