package basics;

public class Employee2 {
   //variables,attributes,properties
	static int sal=10;
	int epmpId=1;
	Employee2(){//parameterised
		
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
	//System.out.println(Increment());//210
	test();
	//System.out.println(sal);
//	System.out.print(test());
		
		
	}
	

public static   void main(String args[]) {
	//depthi();
	Employee2 e1=new  Employee2();
	System.out.println(e1.epmpId);
e1.sal=10+100;
e1.epmpId=202;
	System.out.println(e1.sal);
	System.out.println(e1.epmpId);
	
	Employee2 e2=new  Employee2();
	System.out.println(e2.epmpId);
	System.out.println(e2.sal);
	System.out.println(e2.epmpId);
}


}






