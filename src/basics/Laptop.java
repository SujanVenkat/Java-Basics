package basics;
public interface Laptop{
	double PI=3.14;
    void power();
    static void restart() {
    	signoff();
    	System.out.println("hi interface");
    }
    default void sleep() {
    	signoff();
    	System.out.println("hi sleep");
    }
    private static void signoff() {
    	System.out.println("hi signoff");
    }
	
}