package problem.solving;
import java.util.*;
public  class ShoopingPayment extends RrPaymentService{
	private String paymentId;
	private int amount;
	ShoopingPayment(double bal,int id,int amount){
		super(bal,id);	
		this.amount=amount;
	}
	public int getAmount() {
		return amount;
	}
	public String getPaymentId() {
		return paymentId;
	}
	Random random=new Random();
    void payBill(double balance) {
    	int paymentId1=random.nextInt(9999 - 1111 + 1) + 1111;
		String paymentId="s"+Integer.toString(paymentId1);
		if(getBalance()>amount) {
			double remaining=getBalance()-amount;
			System.out.println(getCustomerId()+" "+paymentId+" "+getBalance()+" "+remaining);
		}
	}
}