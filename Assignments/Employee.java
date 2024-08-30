package Java;

public class Employee {
	int empid;String empname,empaddress;
	public Employee(int empid,String empname,String empaddress)
	{
		this.empid=empid;
		this.empname=empname;
		this.empaddress=empaddress;
	}
	public void show()
	{
		System.out.println("--------Employee details--------");
		System.out.println("employee id ="+empid);
		System.out.println("employee name  ="+empname);
		System.out.println("employee address ="+empaddress);
	}


	public static void main(String[] args) {
		Employee[] emplist=new Employee[5];
		
		emplist[0]=new Employee(12,"ram","india");
		emplist[0].show();
		emplist[1]=new Employee(13,"sham","dubai");
		emplist[1].show();
		emplist[2]=new Employee(14,"shubham","pune");
		emplist[2].show();
		emplist[3]=new Employee(15,"omkar","nashik");
		emplist[3].show();
		emplist[4]=new Employee(16,"ajay","mumbai");
		emplist[4].show();
		
	}

}
