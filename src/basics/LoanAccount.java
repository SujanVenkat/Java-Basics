package basics;
public class LoanAccount extends Account{
	private double loanAmount;
	public void setloanAmount(double loanAmount) {
		this.loanAmount=loanAmount;
	}
	public double getloanAmount() {
		return loanAmount;
	}
	public void payEmi(double amt) {
		loanAmount=loanAmount-amt;
		
	}
} 