package multiclass;

public class Drive{

	public static void main(String[] args) {
		Person p1=new Person();
		System.out.println("person details :");
		System.out.println(p1);
		//dynamic alloc of memory from parent to the child
		Person p;
		p=new Person("Arjun","nashik");
		if(p instanceof Person)
		{
			System.out.println("person details : "+p);
		}
		p=new Employee(12,"CS");
		if(p instanceof Employee)
		{
			System.out.println("employee details "+p);
		}
		p=new Student(90,"Computer Science");
		if(p instanceof Student)
		{
			System.out.println("Student  details "+p);
		}
	}

}
