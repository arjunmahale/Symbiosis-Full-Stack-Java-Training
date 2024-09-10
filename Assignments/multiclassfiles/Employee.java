package multiclass;

public class Employee extends Person
{
	private int empid;
	private String dept;
	public Employee()
	
	{
		this.empid=11;
		this.dept="CS";
	}
	public Employee(int empid,String dept)
	{
		this.empid=empid;
		this.dept=dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", dept=" + dept + "]";
	}
	
	
}