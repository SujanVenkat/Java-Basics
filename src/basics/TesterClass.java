package basics;
public class TesterClass{
	public static void main(String args[]) {
		LoanAccount loanAccount=new LoanAccount();
		loanAccount.setaccountNumber("1002");
		loanAccount.displayAccountDetails();
		SavingsAccount SavingsAccountobj=new SavingsAccount();
		SavingsAccountobj.setaccountNumber("1002");
		SavingsAccountobj.displayAccountDetails();
	}
} 