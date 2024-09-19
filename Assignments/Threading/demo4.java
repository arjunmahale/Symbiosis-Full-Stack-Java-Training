package threading;

import java.awt.DisplayMode;

public class demo4 extends Thread {
	public demo4() {}
	@Override
	public void run() {
		System.out.println("my thread is running state ");
		Display();
		try {
			for(int i=0;i<2;i++) {
				System.out.println("printng the count "+i);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.out.println("my thread is interrupted");
			System.out.println("my thread is run over");
			
		}
		
	}
	public static void display() {
		System.out.println("inside display ()");
	}
	public static void main(String[] args) {
		demo4 obj=new demo4();
		obj.start();
		obj.setName("obj");
		System.out.println(obj.getName());
		obj.setPriority(4);
		demo4 obj1=new demo4();
		obj1.start();
		obj1.setName("obj");
		System.out.println(obj1.getName());
		obj1.setPriority(8);
		demo4 obj2=new demo4();
		obj2.start();
		obj2.setName("obj");
		System.out.println(obj2.getName());
		obj2.setPriority(3);
		System.out.println("obj 2 is alive or not "+obj2.isAlive());

	}

}
