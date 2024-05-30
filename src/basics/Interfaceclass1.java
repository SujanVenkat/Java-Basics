package basics;
public interface Interfaceclass1{
	void noise();
	default void task() {
		System.out.println("no need");
	}
}