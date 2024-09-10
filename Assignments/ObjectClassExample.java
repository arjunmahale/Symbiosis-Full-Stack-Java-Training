package abstractionpck;

public class ObjectClassExample {
	String str="hello";
	public static void equalmethod() {
		String uname="Arjun",pass="Arjun";
		if(uname.equals(pass))
		{
			System.out.println("username is arjun");
		}
	}
	public static void method1(){
		ObjectClassExample obj=new ObjectClassExample();
		System.out.println(obj.str);
	}
	public static void method2(){
		try {
		ObjectClassExample obj1=ObjectClassExample.class.newInstance();
		System.out.println(obj1.str);
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {
		
		method1();   
		method2();
		
	}

}
