package Exceptionhandeling;

public class Exception1 {

	public static void main(String[] args) {
		int a=100,b=0;
		try {
			int c=a/b;
			System.out.println(" c: "+c);
			int d=a+b;
			System.out.println(" d: "+d);
			int e=a-b;
			System.out.println(" e: "+e);
		}
		catch(Exception e) {
			System.out.println("devide by zero not possible");
			System.out.println(e.getMessage());
		}

	}

}
