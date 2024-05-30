package basics;
public class Tester{
	public static void main (String args[]) {
		AccessModifiers_set_getvalues w2=new AccessModifiers_set_getvalues(15,"ece");
		System.out.println(w2.courseid);
		w2.SetCoursename("mtech1");
		System.out.println(w2.getCoursename());
	}
}