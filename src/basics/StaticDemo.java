package basics;
public class StaticDemo{
	private int studentid;
	private String name;
	private static String schoolname="svchs";
	private static int staticcount;
	private  int nonstaticcount=1;
	static {
		 System.out.println("hi i am 2st static block print in order of code");
	 }
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	static void staticmethod() {
		System.out.println("staticmethod");
	}
	 void nonstaticmethod() {
		System.out.println("nonstaticmethod");
	}
	 static {
		 System.out.println("hi i am 1st static block");
	 }
	public static void main(String args[]) {
		StaticDemo d1=new StaticDemo();
		d1.setStudentid(101);
		d1.setName("sujan");
//		d1.setSchoolname("svchs");
		System.out.println(d1.getStudentid());
		System.out.println(d1.getName());
		System.out.println(StaticDemo.schoolname);//classname.staticvarable
		staticcount+=1;
		System.out.println(StaticDemo.staticcount);
		d1.nonstaticcount+=1;
		System.out.println(d1.nonstaticcount);
		StaticDemo s=new StaticDemo();
		s.setStudentid(100);
		s.setName("siri");
//		s.setSchoolname("svchs");
		System.out.println(s.getStudentid());
		System.out.println(s.getName());
		System.out.println(s.getSchoolname());
		staticcount+=1;
		System.out.println(StaticDemo.staticcount);
		s.nonstaticcount+=1;
		System.out.println(s.nonstaticcount);
		StaticDemo.staticmethod();
		s.nonstaticmethod();//should invoke with object reference because not class member
	}
}