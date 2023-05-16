package nitinn;
interface ifs1{
	void fnc();
}
interface ifs2 extends ifs1{
	void fnc2();
}

public class interfacedemo implements ifs2{
	
 public void fnc() {
	System.out.println("hello interface");
	
}
 public void fnc2() {
	 System.out.println("hello interface 2");
 }
 public static void main(String[] args) {
	
 interfacedemo ob=new interfacedemo();
	ob.fnc();
	ob.fnc2();
}
}
