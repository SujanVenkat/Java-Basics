package basics;

public interface Interfaceclass2 {
	
	void noise();
	default void task() {
		System.out.println("i will do work");
	}
}
