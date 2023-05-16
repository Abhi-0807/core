package nitinn;

public class Module_2_21 {
	void Area(int l,int b) {
		System.out.println("Area of Rectangle is : "+(l*b));
	}
	void Area(int s) {
		System.out.println("Area of Square : "+(s*s));
	}
	
	public static void main(String[] args) {
		Module_2_21 ob=new Module_2_21();
		ob.Area(5, 6);
		ob.Area(8);
	}

}
