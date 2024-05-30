package basics;
public class AbstractTest{
	public static void main(String args[]) {
		AbstractPermanent t=new AbstractPermanent();
		t.setdays(30);
		t.salary();
		AbstractContract r=new AbstractContract();
		r.setdays(30);
		r.salary();
	}
}