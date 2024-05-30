package problem.solving;
import java.util.*;
public class Problem01{
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i>=0;i++) {
			 String g=sc.nextLine();
			 if(g.equals("exit")) {
				 for(int j=0;j<al.size();j++) {
					System.out.println(al.get(j)); 
				 }
				break;
				 			 }
			 else {
				 al.add(g);
			 }
		}
	}
}