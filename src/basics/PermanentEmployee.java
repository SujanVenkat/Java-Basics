package basics;

public class PermanentEmployee extends Employeee {
	private double basicPay;
	private double hra;
	private int experience;
	public static double variablecomponent;
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	void calculateSalary() {
	     if (experience>=3) {
	    	 variablecomponent=5*getBasicPay()/100;
	     }else {
	    	 
	     }
	     double r=variablecomponent+basicPay+hra;
	     setSalary(r);
	     System.out.println("permanent Employee:your salary is"+getSalary());
	}

}
