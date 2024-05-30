package basics;
import java.util.*;
public class Students{
	protected String firstName;
	protected String middleName;
	protected String lastName;
	Scanner sc=new Scanner(System.in);
	public void setfirstname() {
		this.firstName=sc.nextLine();
	}
	public String getfirstname() {
		return firstName;
	}
	public void setmiddlename() {
		this.middleName=sc.nextLine();
	}
	public String getmiddlename() {
		return middleName;
	}
	public void setlastname() {
		this.lastName=sc.nextLine();
	}
	public String getlastName() {
		return lastName;
	}
	public String change() {
		setfirstname();
		firstName=firstName.trim();
		setmiddlename();
		middleName=middleName.trim();
		setlastname();
		lastName=lastName.trim();
	    if(middleName.isBlank()) {
		middleName="N.A";
	    }
	    else {
	}
	    String h=String.format(firstName,middleName,lastName);
	    System.out.println(h);
		return h;
	}
	
	public String generateIntials() {
		change();
		char a=firstName.charAt(0);
		char b=middleName.charAt(0);
		char c=lastName.charAt(0);
		String str=Character.toString(a)+Character.toString(b)+Character.toString(c);
		return str;
	}
	
	public static void main(String args[]) {
		Students s=new Students();
		System.out.println(s.generateIntials());
		
	}
}