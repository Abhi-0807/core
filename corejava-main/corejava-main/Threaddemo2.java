package nitinn;

public class Threaddemo2 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("Nitin");
		System.out.println(t);
		t.setPriority(7);
		System.out.println(t);
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(t+" : "+i);
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
