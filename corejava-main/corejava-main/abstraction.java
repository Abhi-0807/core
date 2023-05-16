package nitinn;
abstract class nkp1{
	void first() {
		System.out.println("first");
	}
	abstract void second();
}
class nkp2 extends nkp1{
	void second() {
		System.out.println("second");
	}
}

public class abstraction {
	public static void main(String[] args) {
		nkp2 ob=new nkp2();
		ob.first();
		ob.second();
	}

}
