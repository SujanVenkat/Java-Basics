package basics;
public class CustomException extends Exception {
public CustomException(String msg) { super(msg); } 

public static void divide (int x, int y) throws CustomException {
if(y == 0)
throw new CustomException("The divisor should not be zero");
int z = x/y;
System.out.println(z); }
}