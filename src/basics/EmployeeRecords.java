package basics;
public class EmployeeRecords {
	public static void main(String args[]) {
		PermanentEmployee e1=new PermanentEmployee();
		e1.setName("sujan");
		e1.setEmpID(101);
		e1.setBasicPay(10000);
		e1.setHra(1500);
		e1.setExperience(3);
		e1.calculateSalary();
		PermanentEmployee e2=new PermanentEmployee();
		e2.setName("sujan");
		e2.setEmpID(101);
		e2.setBasicPay(5666777);
		e2.setHra(10);
		e2.setExperience(3);
		e2.calculateSalary();
	}

}
