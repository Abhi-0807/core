package nitinn;


class Triangle{
	int length;
	int breadth;
	int height;
	 
	void area() {
		System.out.println("Area of Triangle : "+(1.5*(breadth*height)));
	}
	void perimeter() {
		System.out.println("Perimeter of Triangle : "+(length+breadth+height));
	}
	
	
}

public class Module_2_25 {
	public static void main(String[] args) {
		Triangle T=new Triangle();
		T.length=4;
		T.breadth=5;
		T.height=6;
		T.area();
		T.perimeter();
		
	}

}
