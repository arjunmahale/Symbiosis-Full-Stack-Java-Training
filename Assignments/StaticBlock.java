package Java;

public class StaticBlock {
	private static int srNo;
	private int section;
	//static block
	static {
		System.out.println("-----within static block-------");
		srNo=1000;
	}
	//static method
	static void display() {
		//System.out.println("section:"+section);
		System.out.println("serial number is :"+srNo);
	}
	StaticBlock(){
		System.out.println("------------within default constructor-----");
		srNo++;
		section++;
	}
	
	public String toString() {
		return "MyClass[serial No = "+srNo+",section = "+section+"]";
	}

	public static void main(String[] args) {
		StaticBlock o1=new StaticBlock();
		System.out.println(o1);  
		StaticBlock.display();
		StaticBlock o2=new StaticBlock();
		System.out.println(o2);  
		StaticBlock.display();
		StaticBlock o3=new StaticBlock();
		System.out.println(o3);  
		StaticBlock.display();
		
	}

}
