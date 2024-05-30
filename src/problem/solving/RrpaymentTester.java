package problem.solving;
public class RrpaymentTester {
	public static void main(String args[]) {
		ShoopingPayment h=new ShoopingPayment(10000.23,50001,5000);
		h.payBill(h.getBalance());
	}

}
