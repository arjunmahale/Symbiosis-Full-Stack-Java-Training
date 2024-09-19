package threading;
class Mythread extends Thread{

	public Mythread() {
		super();
	}
	public Mythread(String name) {
		super();
	}

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName()+" -i : "+i);
		}
		
	}
	
}
public class demo3 {

	public static void main(String[] args) {
	 Mythread mt1=new Mythread();
	 Mythread mt2=new Mythread("child 2");
	 System.out.println(" mt1 threads intial name and priority ");
	 System.out.println(" mt1 name "+mt1.getName());
	 System.out.println(" mt1 priority "+mt1.getPriority());
	 System.out.println();
	 System.out.println(" mt2 threads intial name and priority ");
	 System.out.println(" mt2 name "+mt2.getName());
	 System.out.println(" mt2 priority "+mt2.getPriority());
	mt1.setName("child 1");
	mt1.setPriority(6);
	mt2.setPriority(9);
	System.out.println("\n mt1 threads changed name and priority ");
	 System.out.println(" mt1 name "+mt1.getName());
	 System.out.println(" mt1 priority "+mt1.getPriority());
	 System.out.println();
	 System.out.println(" mt2 threads changed name and priority ");
	 System.out.println(" mt2 name "+mt2.getName());
	 System.out.println(" mt2 priority "+mt2.getPriority());
	 mt1.start();
	 mt2.start();
	 for(int i=0;i<5;i++) {
		 System.out.println("main i :"+i);
	 }
	}

}
