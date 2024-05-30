package basics;
public class UserDefinedException {
	public static void calculate(int withdrawamount,int balance)throws SujanUserDefinedException{
		if(withdrawamount>balance) {
			throw new SujanUserDefinedException("hehe");
		}
		else {
			balance=balance-withdrawamount;
			System.out.println(balance);
		}
	
	}
	static void hehe() {
	System.out.println("done sujan");
	}
	public static void main(String args[]) {
			try{calculate(100,50);}
			catch(SujanUserDefinedException exe) {
			exe.printStackTrace();
			System.out.println(exe);
			}
			hehe();
	}		
}
 class SujanUserDefinedException extends Exception{
	SujanUserDefinedException(String s){
	super(s);
}
}

