package multiclass;

public class Student extends Person {

	private int marks;
	private String div;
	
	public Student()
	{
		this.marks=50;
		this.div="class A";
	}
	public Student(int marks,String div)
	{
		this.marks=marks;
		this.div=div;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", div=" + div + "]";
	}

}
