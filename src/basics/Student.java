package basics;
public class Student{
	private int studentId;
	private String name;
	private float qualifyingExamMarks;
	private char residentialStatus;
	private int yearofEngg;
	 int getStudentId() {
		return studentId;
	}
	public void setstudentId(int studentId) {
		this.studentId=studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}
	public void  setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks=qualifyingExamMarks;
	}
	public String getResidentialStatus() {
		if(residentialStatus=='H'|| residentialStatus=='h' ) {
		String s="hosterller";
		return s;
		}else {
		    String v="dayscholar";
			return v;
		}
	}
	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus=residentialStatus;
	}
	public int getYearofEngg() {
		return yearofEngg;
	}
	public void setyearofEngg(int yearofEngg) {
		this.yearofEngg=yearofEngg;
	}
}