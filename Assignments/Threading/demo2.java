package threading;
class a1 extends Thread{
	public void run() {
		System.out.println("thread A ");
		System.out.println("i in thread A");
		for(int i=0;i<5;i++) {
			System.out.println(" i = "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("thread A finished .");
	}
}
class B extends Thread{
	public void run() {
		System.out.println("thread B ");
		System.out.println("i in thread B");
		for(int i=0;i<5;i++) {
			System.out.println(" i = "+i);
		}
		System.out.println("thread B finished .");
	}
}
public class demo2 {

	public static void main(String[] args) {
		a1 threadA=new a1();
		B threadB =new B();
		//both the above threads are in runnable state
		//running state of A and B
		threadA.start();
	//move control to another thread
		threadA.yield();
		//blocked state of thread B
		try {
			threadA.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		threadB.start();
		System.out.println("main thread end");
	

	}

}
