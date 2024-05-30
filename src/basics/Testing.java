package basics;
public class Testing{
	public static void main(String args[]) {
		Student s1=new Student();
		s1.setstudentId(1001);
		s1.setName("jacob");
		s1.setQualifyingExamMarks(80);
		s1.setResidentialStatus('h');
		s1.setyearofEngg(3);
		System.out.println("stuudentname"+s1.getStudentId());
		System.out.println("studentid"+s1.getName());
		System.out.println("qulifying marks"+s1.getQualifyingExamMarks());
		System.out.println("year of eengg"+s1.getYearofEngg());
		System.out.println("residential status"+s1. getResidentialStatus());
	}}
