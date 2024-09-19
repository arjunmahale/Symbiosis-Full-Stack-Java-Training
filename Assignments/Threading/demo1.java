package threading;

public class demo1 extends Thread{

	@Override
		public void run() {
			for(int i=0;i<5;i++)
			{
				try {
					System.out.println("I : "+i);
					Thread.sleep(1000);
					
				} catch (Exception e) {
				System.out.println(e);
				}
				
			}
		}
	
	public static void main(String[] args) {
	
		Thread t=new demo1();
		t.run();
		System.out.println("thread 1 is : "+t.getName());
		t.setName("thread 1");
		System.out.println("new thread is :"+t.getName());
		t.setName("thread 2");
		System.out.println("new thread is :"+t.getName());
		t.setName("thread 3");
		System.out.println("new thread is :"+t.getName());
		Thread t1=new demo1();
		t1.run();
		System.out.println("thread 1 is : "+t1.getName());
		t1.setName("thread 1");
		System.out.println("new thread is :"+t1.getName());
		t1.setName("thread 2");
		System.out.println("new thread is :"+t1.getName());
		t1.setName("thread 3");
		System.out.println("new thread is :"+t1.getName());

	}

}
