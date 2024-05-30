package basics;
public class ClassObjects{
	int studentid;
	String name;
	double fee;
	char gender;
	ClassObjects(){
		System.out.println("default constructor");//first when code sees in object creation it comes here
	}
	public int work(){
		
      int i=7;
      return i;
		
	}
	public static void main(String args[]) {
		ClassObjects s1=new ClassObjects();//default constructor
	    ClassObjects s2=new ClassObjects();
		System.out.println(s1.studentid);
		s1.studentid=10;
		System.out.println(s1.studentid);
		System.out.println(s2.studentid);//objects are independent
		s2.name="sujan";
		System.out.println(s2.name);
		System.out.println(s1.work()+s1.studentid);
		System.out.println(s2.work());
		
	}
}