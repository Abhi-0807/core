package nitinn;

public  class Module_2_22 {
	void parent() {
		System.out.println("This is a parent class");
	}
}
class abc extends Module_2_22 {
	void child() {
		System.out.println("This is a Child Class");
	}
	
	public static void main(String[] args) {
		Module_2_22 ob=new Module_2_22();
		ob.parent();
		abc obj=new abc();
		obj.child();
		obj.parent();
	}
	
}
