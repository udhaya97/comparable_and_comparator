package comparable;

public class Student implements Comparable<Student>{
	
	private int sId;
	private String sName;
	private int rollNo;
	private int year;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Student(int sId, String sName, int rollNo, int year) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.rollNo = rollNo;
		this.year = year;
	}
	public Student() {
		super();
	}
	@Override
	public int compareTo(Student o) {
		return this.getsName().compareTo(o.getsName());//for string using comparable and comparator
		
		/*
		 * if(this.getsId()<o.getsId()) return 1; else
		 * 
		 * return -1;//for integer type
		 */
	}
	
	

}
