package nitinn;
class kumar implements Runnable{
	
	Thread t;
	String sname;
	public kumar(String sname) {
		this.sname=sname;
		t=new Thread(this,sname);
		t.start();
	}
	
	public void run() {
		try {
			for(int i=0;i<=5;i++) {
			System.out.println(t+" : "+i);
			Thread.sleep(1000);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Exiting");
	}
	
}

public class MultiThreadingprac3 {
	public static void main(String[] args) {
		new kumar("one");
		new kumar("two");
		new kumar("three");
		Thread t=Thread.currentThread(); 
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(t+" : "+i);
				Thread.currentThread();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Exiting");
	}

}
