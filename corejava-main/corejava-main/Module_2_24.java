package nitinn;

class Rectangle{
	int length,breadth;
	public Rectangle(int l,int b){
		length=l;
		breadth=b;
	}
	void Area() {
		System.out.println("Area of Rectangle : "+(length*breadth));
	}
	void perimeter() {
		System.out.println("Perimeter of Rectangle : "+2*(length+breadth));
	}
	
}
class Square extends Rectangle{

	public Square(int s) {
		super(s, s);
	}

public class Module_2_24 {
	public static void main(String[] args) {
		Rectangle r=new Rectangle(4, 6);
		Square s=new Square(4);
		r.Area();
		r.perimeter();
		s.Area();
		s.perimeter();
	}
		
}}
