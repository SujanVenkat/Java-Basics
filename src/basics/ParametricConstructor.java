package basics;
public class ParametricConstructor{
	int studentid;
	String name;
	double fee;
	char gender;
	ParametricConstructor(int id,String name,double fee,char gender){//parametric constructor ,special method
		System.out.println("default constructor");
		//first when code sees in object creation it comes here
        this.studentid=id;
        this.name=name;
        this.fee=fee;
        this.gender=gender;
	}
	public int work(){
		
      int i=7;
      return i;
		
	}
	public static void main(String args[]) {
		ParametricConstructor s1=new ParametricConstructor(1,"susu",60,'f');//default constructor
		ParametricConstructor s2=new ParametricConstructor(2,"deep",70,'m');
		
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
