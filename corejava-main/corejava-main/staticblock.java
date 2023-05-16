package nitinn;


public class staticblock {
	static int a=20;
	static int b;
	static void meth1(int x) {
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		System.out.println("X: "+x);
	}
	static {
		System.out.println("static block called");
		b=a*4;
	}
	public static void main(String[] args) {
		meth1(5);
	}

}
