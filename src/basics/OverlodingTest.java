package basics;
 class OverloadingTest {
	
	public void display(String ref){
		System.out.println("String..."+ref);
	}
	
	public void display(Object ref){
		System.out.println("Object..."+ref);
	}
	
     public static void main(String[] args) {
    	 OverloadingTest test=new OverloadingTest();
    	 test.display(null);
	     
}}