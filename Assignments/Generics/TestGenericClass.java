package generic;

public class TestGenericClass {

	public static void main(String[] args) {
		GenericClass<String>stringobj=new GenericClass<String>();
		stringobj.set("hello");
		System.out.println(stringobj.get());
		GenericClass<Integer>stringobj1=new GenericClass<Integer>();
		stringobj1.set(10);
		System.out.println(stringobj1.get());
	}

}
