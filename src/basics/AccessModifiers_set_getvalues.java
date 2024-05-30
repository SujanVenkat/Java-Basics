package basics;
public class AccessModifiers_set_getvalues{
	public int courseid;
	private String coursename;
    double feee;
public AccessModifiers_set_getvalues(int id,String name){
		this.courseid=id;
		this.coursename=name;
	}
	public void SetCoursename(String nam) {
		this.coursename=nam;
	}
	public String getCoursename() {
		return coursename;
	}
	public double getfee() {
		return feee;
	}
	public static void main(String args[]) {
		AccessModifiers_set_getvalues w1=new AccessModifiers_set_getvalues(102,"cse");
		w1.courseid=121;
		System.out.println(w1.courseid);
		System.out.println(w1.coursename);
		
	}
}