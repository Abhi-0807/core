package nitinn;
class final1{
	final int a;
	public  final1(){
		a=10;
	}
	 void show() {
		System.out.println("hello ");
	}
}
class final2 extends final1{
	void show() {
		
		System.out.println("hello world");
	}
}
public class finalkeyworddemo extends final2 {
	public static void main(String[] args) {
		finalkeyworddemo ob=new finalkeyworddemo();
		ob.show();
	}

}
