package nitinn;
class nitin1 implements Runnable{
	Thread t;
	String sname;
	public nitin1( String sname) {
		this.sname = sname;
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
		System.out.println("child Thread exiting");
	}
	
	
	
}

public class CreateThread {
	public static void main(String[] args) {
		new nitin1("one");
		new nitin1("Two");
		new nitin1("Three");
		Thread t=Thread.currentThread();
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Exiting");
	}

}
