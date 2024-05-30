package basics;
public class SuperC extends SuperP{
	int c;
    SuperC(){
    	
    	System.out.println("child constructor parameters");
    	
    }
	void ParentMethod(){
		super.parentMethod();
		private1();
		System.out.println(b);
		System.out.println("hi i am in child class override the Parent method");
		
	}
}