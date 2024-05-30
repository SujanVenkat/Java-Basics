package basics;

public class Employee {
   //variables,attributes,properties
	static int sal=10;
	int epmpId=1;
	Employee(int salary, int empId){//parameterised
		sal=salary;
		epmpId=empId;
	}
	//behaviours,method,function
	
	// method creation
	//  - accessmodifier dataType methodName() 
	//   - public int work()
	
	public static int Increment() {
		int lsal=sal+200;
		return lsal;//210
		
	}
	
	public static void test() {
		sal=sal+200;//410
		
		
	}
	
	public static void depthi() {
	System.out.println(Increment());//210
	test();
	System.out.println(sal);
//	System.out.print(test());
		
		
	}
	

public static   void main(String args[]) {
	depthi();
	Employee e1=new  Employee(100,1);
	int a1=e1.sal;
	Employee e2=new  Employee(200,2);
	int a2=e2.sal;
}


}






