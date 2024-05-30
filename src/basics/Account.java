package basics;
public class Account{
	private String accountNumber;
	private String customerName;
	private double balance;
	public void displayAccountDetails() {
		System.out.println("customername"+customerName);
		System.out.println("accountNumber"+accountNumber);
		System.out.println("balance"+balance);
	}
	public void setaccountNumber(String a) {
		this.accountNumber=a;
	}
	public String getaccountNumber() {
		return accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}