package problem.solving;
public abstract class RrPaymentService{
	private double balance;
	private int customerId;
	RrPaymentService(double bal,int id ){
		this.balance=bal;
		this.customerId=id;
	}
	public double getBalance() {
		return balance;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	abstract void payBill(double amount);
	
}