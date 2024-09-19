package threading;

public class runnableExample implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			try {
				System.out.println("I : "+i);
				Thread.sleep(1000);
				
			} catch (Exception e) {
			e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		runnableExample robj=new runnableExample();
		Thread t1=new Thread(robj);
		t1.start();

	}

}
